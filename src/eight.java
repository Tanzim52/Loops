import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Print each character on a separate line
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }
}
