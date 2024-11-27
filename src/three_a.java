import java.util.Scanner;

public class three_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                System.out.print(c);
            }
        }
    }
}
