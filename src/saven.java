import java.util.Scanner;
import java.util.Random;

public class saven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Read the input word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        char[] charArray = word.toCharArray(); // Convert the word to a character array for easy manipulation

        // Repeat word.length() times
        for (int k = 0; k < word.length(); k++) {
            int i = random.nextInt(word.length() - 1); // Random position i (not the last position)
            int j = random.nextInt(word.length() - i - 1) + i + 1; // Random position j > i

            // Swap characters at positions i and j
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        // Convert the character array back to a string and print the result
        String permutedWord = new String(charArray);
        System.out.println("Randomly permuted word: " + permutedWord);
    }
}
