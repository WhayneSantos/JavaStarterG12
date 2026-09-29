package Scanner;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("This is my Nested If Else program for Weather Decisions.");

        System.out.println("is it currently raining outside?: ");;
        System.out.println("[1] Yes");
        System.out.println("[2] No");

        int isRaining = input.nextInt();

        if (isRaining == 1 ) {
            System.out.println("Looks like it is a rainy day.");

            System.out.println("Do you have an umbrella with you?");
                System.out.println("[1] Yes");
                System.out.println("[2] No");

                int hasUmbrella = input.nextInt();

            if (hasUmbrella == 1) {
                System.out.println("You are safe to go outside without getting wet!");
            } else {
                System.out.println("You should probably stay inside, or you will get wet.");
            }

        } else {
            System.out.println("It is a clear day! Enjoy the good weather outside.");
        }

        input.close();
    }
}
