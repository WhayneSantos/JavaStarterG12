package AlgorithmPresentation;
public class Algorithm {
    public static boolean isPalindrome(String text) {
        // Clean the string: convert to lowercase and remove spaces/punctuation
        text = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int left = 0;
        int right = text.length() - 1;

        // Move pointers toward the middle
        while (left < right) {
            // If characters don't match, it's not a palindrome
            if (text.charAt(left) != text.charAt(right)) {
                return false; 
            }
            
            left++;  // Move rightward
            right--; // Move leftward
        }

        return true; // Pointers met in the middle successfully
    }

    public static void main(String[] args) {
        String word1 = "abdulludba";
        String word2 = "java";

        System.out.println("Is '" + word1 + "' a palindrome? " + isPalindrome(word1));
        System.out.println("Is '" + word2 + "' a palindrome? " + isPalindrome(word2));
    }
}