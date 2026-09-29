import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        // Create a scanner to read user input from the keyboard
        Scanner input = new Scanner(System.in);
        
        // Number of customers to process in this run
        int customer = 5; 

        System.out.println("TECH KITCHEN ORDERING SYSTEM");

        // Loop until there are no more customers left
        while (customer > 0) {
            
            // Store the selected food item and its price for the current order
            String mealChoice = "";
            double mealPrice = 0.0;
            
            String drinkChoice = "";
            double drinkPrice = 0.0;
            
            String dessertChoice = "";
            double dessertPrice = 0.0;
            
            // If any input is invalid, the order will be cancelled
            boolean validOrder = true;

            // 1. MEAL SWITCH STATEMENT
            System.out.println("\n--- SILOG MENU ---");
            System.out.println("0. No Meal");
            System.out.println("1. Tapsilog (PHP 95.00)");
            System.out.println("2. Longsilog (PHP 100.00)");
            System.out.println("3. Tocilog (PHP 110.00)");
            System.out.print("Choose a meal (0-3): ");
            int mealNum = input.nextInt();
            int qty = 0; // variable to hold the "how many?" input

            switch (mealNum) {
                case 0:
                    mealChoice = "None";
                    mealPrice = 0.0;
                    break;
                case 1:
                    System.out.print("How many Tapsilog? ");
                    qty = input.nextInt();
                    mealChoice = qty + "x Tapsilog";
                    mealPrice = 95.00 * qty; // Fixed: Changed from 120.00 to 95.00
                    break;
                case 2:
                    System.out.print("How many Longsilog? ");
                    qty = input.nextInt();
                    mealChoice = qty + "x Longsilog";
                    mealPrice = 100.00 * qty;
                    break;
                case 3:
                    System.out.print("How many Tocilog? ");
                    qty = input.nextInt();
                    mealChoice = qty + "x Tocilog";
                    mealPrice = 110.00 * qty;
                    break;
                default:
                    mealChoice = "None";
                    mealPrice = 0.0;
                    validOrder = false;
                    System.out.println("Invalid choice. No meal selected.");
                    break;
            }

            // 2. DRINKS SWITCH STATEMENT
            System.out.println("\n--- DRINKS MENU ---");
            System.out.println("0. No Drink");
            System.out.println("1. Coke (PHP 25.00)");
            System.out.println("2. Royal (PHP 25.00)");
            System.out.println("3. Water (PHP 15.00)");
            System.out.print("Choose a drink (0-3): ");
            int drinkNum = input.nextInt(); // the user's drink choice, numbers

            switch (drinkNum) {
                case 0:
                    drinkChoice = "None";
                    drinkPrice = 0.0;
                    break;
                case 1:
                    System.out.print("How many Coke? ");
                    qty = input.nextInt();
                    drinkChoice = qty + "x Coke";
                    drinkPrice = 25.00 * qty;
                    break;
                case 2:
                    System.out.print("How many Royal? ");
                    qty = input.nextInt();
                    drinkChoice = qty + "x Royal";
                    drinkPrice = 25.00 * qty;
                    break;
                case 3:
                    System.out.print("How many Water? ");
                    qty = input.nextInt();
                    drinkChoice = qty + "x Water";
                    drinkPrice = 15.00 * qty;
                    break;
                default:
                    drinkChoice = "None";
                    drinkPrice = 0.0;
                    validOrder = false;
                    System.out.println("Invalid choice. No drink selected.");
                    break;
            }

            // 3. DESSERT SWITCH STATEMENT
            System.out.println("\n--- DESSERT MENU ---");
            System.out.println("0. No Dessert");
            System.out.println("1. Leche Flan (PHP 50.00)");
            System.out.println("2. Halo-Halo (PHP 80.00)");
            System.out.print("Choose a dessert (0-2): ");
            int dessertNum = input.nextInt(); // the user's dessert choice, numbers

            switch (dessertNum) {
                case 0:
                    dessertChoice = "None";
                    dessertPrice = 0.0;
                    break;
                case 1:
                    System.out.print("How many Leche Flan? ");
                    qty = input.nextInt();
                    dessertChoice = qty + "x Leche Flan";
                    dessertPrice = 50.00 * qty;
                    break;
                case 2:
                    System.out.print("How many Halo-Halo? ");
                    qty = input.nextInt();
                    dessertChoice = qty + "x Halo-Halo";
                    dessertPrice = 80.00 * qty;
                    break;
                default:
                    dessertChoice = "None";
                    dessertPrice = 0.0;
                    validOrder = false;
                    System.out.println("Invalid choice. No dessert selected.");
                    break;
            }

            // Calculate total amount
            double totalPrice = mealPrice + drinkPrice + dessertPrice;
            System.out.println("\nTotal Amount Due: PHP " + totalPrice);

            if (!validOrder) {
                System.out.println("\nTransaction cancelled due to an invalid input. Please try again.");
            } else if (totalPrice == 0) {
                System.out.println("\nYou didn't order anything! Transaction cancelled.");
            } else {
                // 4 & 5. IF-ELSE FOR BAYAD AND SUKLI
                System.out.print("Enter your Payment (Bayad): PHP ");
                double bayad = input.nextDouble();

                double sukli = 0.0;
                boolean isPaid = false;

                if (bayad >= totalPrice) {
                    sukli = bayad - totalPrice;
                    isPaid = true;
                    System.out.println("Payment successful!");
                } else {
                    System.out.println("Transaction Failed: Insufficient payment! You are short by PHP " + (totalPrice - bayad));
                }

                // 6. PRINT ORDER AND RECEIPT
                if (isPaid) {
                    System.out.println("\n        OFFICIAL RECEIPT        ");
                    System.out.println("Meal    : " + mealChoice + " (PHP " + mealPrice + ")");
                    System.out.println("Drink   : " + drinkChoice + " (PHP " + drinkPrice + ")");
                    System.out.println("Dessert : " + dessertChoice + " (PHP " + dessertPrice + ")");
                    System.out.println("--------------------------------");
                    System.out.println("Total   : PHP " + totalPrice);
                    System.out.println("Bayad   : PHP " + bayad);
                    System.out.println("Sukli   : PHP " + sukli);
                    System.out.println("   Thank you for your order!    ");
                }
            }
            
            customer--; 

            if (customer == 0) {
                System.out.println("\nNo more customers. System closing.");
                break; 
            }

            // Order again prompt
            System.out.print("\nWould you like to process the next order? (yes/no): ");
            String ans = input.next();

            if (ans.equalsIgnoreCase("Yes") || ans.equalsIgnoreCase("y")) {
                System.out.println("\n=================================");
                System.out.println("      Serving Next Customer      ");
                System.out.println("=================================");
            } else {
                System.out.println("\nThank you! Have a great day.");
                break; 
            }
        }

        input.close();
    }
}