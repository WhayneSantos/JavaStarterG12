

import java.util.Scanner;

class SwitchDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Movie Genre Picker ===");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Horror");
        System.out.println("4. Sci-Fi");
        System.out.print("Choose a genre number (1-4): ");

        int choice = input.nextInt();

        // SWITCH STATEMENT: Compares 'choice' against different cases
        switch (choice) {
            case 1:
                System.out.println("Recommended Movie: John Wick (Action)");
                break; // 'break' exits the switch block
            case 2:
                System.out.println("Recommended Movie: Superbad (Comedy)");
                break;
            case 3:
                System.out.println("Recommended Movie: The Conjuring (Horror)");
                break;
            case 4:
                System.out.println("Recommended Movie: Interstellar (Sci-Fi)");
                break;
            default:
                // Runs if the user types a number that doesn't match any case
                System.out.println("Invalid choice! Please pick a number from 1 to 4.");
                break;
        }

        input.close();
    }
}