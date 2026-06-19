package BasicStrucAndSyntax;

public class DataTypes {
    public static void main(String[] args) {

        // Pokemon Information
        String pokemonName = "Pikachu";
        byte level = 25;
        short pokedexNumber = 25;
        int hp = 120;
        int attack = 95;
        int defense = 70;
        long totalExperience = 9876543210L;
        float criticalHitChance = 19.99f;
        double accuracy = 99.95;
        char rank = 'A';
        boolean isLegendary = false;
        String heldItem = null;
        char lightning = '\u26A1'; // ⚡
        char star = '*';
        int totalStats = hp + attack + defense;

        System.out.println(" POKEMON PROFILE: ");
        System.out.println("Name: " + pokemonName);
        System.out.println("Pokedex #: " + pokedexNumber);
        System.out.println("Level: " + level);
        System.out.println();

        System.out.println(" STATS: ");
        System.out.println("HP: " + hp);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: " + defense);
        System.out.println("Total Stats: " + totalStats);
        System.out.println();

        System.out.println(" BATTLE INFO: ");
        System.out.println("Experience: " + totalExperience);
        System.out.println("Critical Hit Chance: " + criticalHitChance + "%");
        System.out.println("Accuracy: " + accuracy + "%");
        System.out.println();

        System.out.println(" DETAILS: ");
        System.out.println("Rank: " + rank);
        System.out.println("Legendary: " + isLegendary);
        System.out.println("Held Item: " + heldItem);
        System.out.println("Type Symbol: " + lightning);
        System.out.println("Favorite Symbol: " + star);
    }
}