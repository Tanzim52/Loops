import java.util.Scanner;

public class XShapeInBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the side length of the box
        System.out.print("Enter the side length: ");
        int n = scanner.nextInt();

        // Print the top row of the box
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println(); // Move to the next line

        // Print the middle rows (with X pattern)
        for (int i = 1; i < n - 1; i++) {
            for (int j = 0; j < n; j++) {
                // Print * at the borders and diagonals
                if (j == i || j == n - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line
        }

        // Print the bottom row of the box
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println(); // Move to the next line
    }
}
