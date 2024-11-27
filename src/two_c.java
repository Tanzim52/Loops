import java.util.Scanner;

public class two_c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers (end with a non-integer):");

        int cumulativeSum = 0;

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            cumulativeSum += num;
            System.out.print(cumulativeSum + " ");
        }
    }
}
