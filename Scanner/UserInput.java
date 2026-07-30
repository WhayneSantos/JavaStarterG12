package Scanner;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("This is my Nested If Else program for Weather Decisions.");

        System.out.print("It is currently raining outside? (enter true or false): ");
        boolean isRaining = input.nextBoolean();

        if (isRaining) {
            System.out.println("Looks like it is a gloomy day.");

            System.out.print("You have an umbrella with you. (enter true or false): ");
            boolean hasUmbrella = input.nextBoolean();

            if (hasUmbrella) {
                System.out.println("You are safe to go outside without getting wet!");
            } else {
                System.out.println("You should probably stay inside, or you will get soaked.");
            }

        } else {
            System.out.println("It is a clear day! Enjoy the good weather outside.");
        }

        input.close();
    }
}
