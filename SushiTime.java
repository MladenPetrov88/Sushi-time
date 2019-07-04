import java.util.Scanner;

public class SushiTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sushiName = scanner.nextLine();
        String restName = scanner.nextLine();
        int portions = Integer.parseInt(scanner.nextLine());
        String home = scanner.nextLine();

        double price = 0;

        if (restName.equals("Sushi Zone")){
            if (sushiName.equals("sashimi")){
                price = 4.99;
            } else if (sushiName.equals("maki")) {
                price = 5.29;
            } else if (sushiName.equals("uramaki")) {
                price = 5.99;
            } else if (sushiName.equals("temaki")) {
                price = 4.29;
            }
        }

        if (restName.equals("Sushi Time")){
            if (sushiName.equals("sashimi")){
                price = 5.49;
            } else if (sushiName.equals("maki")) {
                price = 4.69;
            } else if (sushiName.equals("uramaki")) {
                price = 4.49;
            } else if (sushiName.equals("temaki")) {
                price = 5.19;
            }
        }

        if (restName.equals("Sushi Bar")){
            if (sushiName.equals("sashimi")){
                price = 5.25;
            } else if (sushiName.equals("maki")) {
                price = 5.55;
            } else if (sushiName.equals("uramaki")) {
                price = 6.25;
            } else if (sushiName.equals("temaki")) {
                price = 4.75;
            }
        }

        if (restName.equals("Asian Pub")){
            if (sushiName.equals("sashimi")){
                price = 4.50;
            } else if (sushiName.equals("maki")) {
                price = 4.80;
            } else if (sushiName.equals("uramaki")) {
                price = 5.50;
            } else if (sushiName.equals("temaki")) {
                price = 5.50;
            }
        }

        double totalPrice = portions * price;

        if (!restName.equals("Sushi Zone") && !restName.equals("Sushi Time") && !restName.equals("Sushi Bar") && !restName.equals("Asian Pub")) {
            System.out.printf("%s is invalid restaurant!", restName);

        }

        else if (home.equals("Y")) {
            totalPrice = totalPrice + totalPrice * 0.2;
        }

        if (restName.equals("Sushi Zone") || restName.equals("Sushi Time") || restName.equals("Sushi Bar") || restName.equals("Asian Pub"))
        System.out.printf("Total price: %.0f lv.", Math.ceil(totalPrice));
    }
}
