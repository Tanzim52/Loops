import java.util.Scanner;

public class FilledDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the side length of the diamond
        System.out.print("Enter the side length: ");
        int n = scanner.nextInt();

        // Print the top half of the diamond (including the middle row)
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

        // Print the bottom half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}
