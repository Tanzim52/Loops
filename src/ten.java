import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase();

        int vowelCount = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if ("aeiouy".indexOf(ch) != -1) { // Check if the character is a vowel
                vowelCount++;
            }
        }

        System.out.println("The word contains " + vowelCount + " vowels.");
    }
}
