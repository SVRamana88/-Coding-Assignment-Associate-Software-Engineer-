public class PangramChecker {

    // Function to check if a string is a pangram
    public static boolean isPangram(String str) {
        boolean[] alphabet = new boolean[26]; // Create a boolean array to track the presence of each letter

        // Iterate through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isAlphabetic(c)) {
                // If the character is alphabetic, mark its presence in the alphabet array
                alphabet[Character.toLowerCase(c) - 'a'] = true;
            }
        }

        // Check if any letter is missing in the alphabet array
        for (boolean flag : alphabet) {
            if (!flag) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true; // If all letters are present, it's a pangram
    }

    public static void main(String[] args) {
        String str1 = "The quick brown fox jumps over the lazy dog.";
        String str2 = "Hello Hi How are you. I am looking for a developer Job. ha ha ha!";

        // Test the function with example strings
        System.out.println(isPangram(str1)); // true (contains all letters of the alphabet)
        System.out.println(isPangram(str2)); // false (missing some letters)
    }
}
