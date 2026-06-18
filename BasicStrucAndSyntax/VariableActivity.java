package BasicStrucAndSyntax;

public class VariableActivity {
    public static void main(String[] args) {

        // Pokemon Information
        String pokemon = "Mewtwo";
        int level = 70;
        float weight = 122.0f; // in kilograms
        String type = "Psychic";
        boolean isLegendary = true;

        // Additional Details
        String ability = "Pressure";
        int hp = 106;
        String region = "Kanto";
        char gender = 'N'; // N = Genderless
        int height = 2; // in meters

        System.out.println("=== Legendary Pokemon Profile ===");
        System.out.println("Pokemon: " + pokemon);
        System.out.println("Level: " + level);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " m");
        System.out.println("Type: " + type);
        System.out.println("Ability: " + ability);
        System.out.println("HP: " + hp);
        System.out.println("Region: " + region);
        System.out.println("Gender: " + gender);
        System.out.println("Is Legendary: " + isLegendary);
    }
}