import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the exchange rate from USD to yen
        System.out.print("Enter today's price for one dollar in Japanese yen: ");
        double exchangeRate = scanner.nextDouble();

        // Read U.S. dollar values and convert to yen
        while (true) {
            System.out.print("Enter a dollar amount to convert (0 to quit): ");
            double dollars = scanner.nextDouble();
            if (dollars == 0) {
                break; // Sentinel value to terminate input
            }
            double yen = dollars * exchangeRate; // Convert to yen
            System.out.println(dollars + " USD is " + yen + " yen.");
        }

        System.out.println("Program terminated.");
    }
}
