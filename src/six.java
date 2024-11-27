import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean first = true;
        double minimum = 0; // Initialize but will be set during first iteration

        System.out.println("Enter numbers (type 'done' to finish):");

        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                if (first) {
                    minimum = value;
                    first = false;
                } else if (value < minimum) {
                    minimum = value;
                }
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number or 'done' to finish.");
                }
            }
        }

        if (first) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("The minimum value is: " + minimum);
        }
    }
}
