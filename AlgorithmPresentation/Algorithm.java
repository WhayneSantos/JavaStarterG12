package AlgorithmPresentation;
public class Algorithm {
    public static boolean isPalindrome(String text) {
        // Clean the string: convert to lowercase and remove spaces/punctuation
        //A man, a plan, a canal: Panama!
        text = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = text.length() - 1;
        //“amanaplanacanalpanama”
        
        // Move pointers toward the middle
        //R A C E C A R
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
        String word1 = "C A T"; 
        String word2 = "R A C E C A R";

        System.out.println("Is '" + word1 + "' a palindrome? " + isPalindrome(word1));
        System.out.println("Is '" + word2 + "' a palindrome? " + isPalindrome(word2));
    }
}