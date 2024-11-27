import java.util.Scanner;

public class two_d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers (end with a non-integer):");

        Integer prev = null;
        while (scanner.hasNextInt()) {
            int current = scanner.nextInt();
            if (prev != null && current == prev) {
                System.out.print(current + " ");
                while (scanner.hasNextInt() && scanner.nextInt() == current) {
                } // Skip duplicates
            }
            prev = current;
        }
    }
}
