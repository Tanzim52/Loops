import java.util.Scanner;

public class tow_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers (end with a non-integer):");

        int evenCount = 0, oddCount = 0;

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
