import java.util.Scanner;

public class thirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Binary digits (from least significant to most significant):");

        if (number == 0) {
            System.out.println(0);
        } else {
            while (number > 0) {
                System.out.println(number % 2); // Print the remainder
                number = number / 2;          // Update the number
            }
        }
    }
}
