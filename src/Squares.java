import java.util.Scanner;

public class Squares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the side length of the squares
        System.out.print("Enter the side length of the squares: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            // Filled square
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }

            System.out.print(" "); // Space between the two squares

            // Hollow square
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*"); // Print * for border
                } else {
                    System.out.print(" "); // Print space for the hollow part
                }
            }

            System.out.println(); // Move to the next row
        }
    }
}
