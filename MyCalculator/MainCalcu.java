package MyCalculator;

import java.util.Scanner;

public class MainCalcu {

    //add a to b

    //subtract b from a
    public static double subtract(double a, double b){
        double difference = a - b;
        return difference;
    }
    //multiply a and b
    public static double multiply(double a, double b){
        double product = a * b;
        return product;
    }
    // divide a and b
    public static double divide(double a, double b){
        double quotient = a / b;
        return quotient;
    }
    // modulus a by b
    public static double modulus(double a, double b){
        double remainder = a % b;
        return remainder;
    }
    // the average of the two numbers
    public static double average(double a, double b){ 
        double ave = a % b;
        return ave;
    }
    // the bigger number
    public static double max(double a, double b){ 
        double m = Math.max(a, b);
        return m;
    }
    // the first number time itself
    public static double square(double a, double b){ 
        double sq = a * a;
        return sq;
    }

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("=== CALCULATOR ===");
        System.out.println("[1] Add");
        System.out.println("[2] Subtract");
        System.out.println("[3] Multiply");
        System.out.println("[4] Divide");
        System.out.println("[5] Modulus");
        System.out.println("[6] Average");
        System.out.println("[7] Max");
        System.out.println("[8] Square");
        System.out.println("=== === === === ===");
        
        System.out.println("Choice an Operation:");
        int choice = input.nextInt();

        System.out.println("Enter First Number:");
        int num1 = input.nextInt();

        System.out.println("Enter Second Number:");
        int num2 = input.nextInt();

        if (choice == 1) {
            double result = add(num1, num2);
            System.out.println("Result: " + result);
        } else if (choice == 2) {
            double result = subtract(num1, num2);
            System.out.println("Result: " + result);
        } else if (choice == 3) {
            double result = multiply(num1, num2);
            System.out.println("Result: " + result);
        } else if (choice == 4) {
            if (num2 == 0){
                System.out.println("Error: Cannot Divide by zero");
            } else {
            double result = divide(num1, num2);
            System.out.println("Result: " + result);
            }
        } else if (choice == 5) {
            double result = modulus(num1, num2);
            System.out.println("Result: " + result);
        } else if (choice == 6) {
            double result = average(num1, num2);
            System.out.println("Result: " + result);
        } else if (choice == 7) {
            double result = max(num1, num2);
            System.out.println("Result: " + result);
        } else if (choice == 8) {
            double result = square(num1, num2);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid Choice");
        }
        
        input.close();
    }
}
