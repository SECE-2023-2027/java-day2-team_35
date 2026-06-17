import java.util.ArrayList;

public class LongestWords {
    public static void main(String[] args) {

        String[] words = {
                "cat",
                "flag",
                "green",
                "country",
                "w3resource"
        };

        int maxLength = 0;

        // Find maximum length
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }

        // Print all words having maximum length
        System.out.println("Longest word(s):");
        for (String word : words) {
            if (word.length() == maxLength) {
                System.out.println(word);
            }
        }
    }
}