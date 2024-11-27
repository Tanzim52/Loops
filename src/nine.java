import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Print the word in reverse
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
    }
}
