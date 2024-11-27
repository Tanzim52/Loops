import java.util.Scanner;

public class three_e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if ("AEIOUaeiou".indexOf(c) != -1) {
                System.out.println("Vowel '" + c + "' at position: " + i);
            }
        }
    }
}
