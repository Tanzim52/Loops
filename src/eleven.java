import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class eleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        ArrayList<String> substrings = new ArrayList<>();

        // Generate all substrings
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                substrings.add(word.substring(i, j));
            }
        }

        // Sort substrings by length
        substrings.sort((a, b) -> a.length() - b.length());

        // Print substrings
        for (String substring : substrings) {
            System.out.println(substring);
        }
    }
}
