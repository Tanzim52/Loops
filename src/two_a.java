import java.util.Scanner;

public class two_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers (end with a non-integer):");

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num < smallest) smallest = num;
            if (num > largest) largest = num;
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}
