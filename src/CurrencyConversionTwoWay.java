import java.util.Scanner;

public class CurrencyConversionTwoWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the exchange rate from USD to yen
        System.out.print("Enter today's price for one dollar in Japanese yen: ");
        double exchangeRate = scanner.nextDouble();

        // Convert dollars to yen
        System.out.println("\nEnter U.S. dollar amounts to convert to yen (0 to quit):");
        while (true) {
            System.out.print("Dollar amount: ");
            double dollars = scanner.nextDouble();
            if (dollars == 0) {
                break; // Sentinel value to stop the input
            }
            double yen = dollars * exchangeRate;
            System.out.println(dollars + " USD is " + yen + " yen.");
        }

        // Convert yen to dollars
        System.out.println("\nEnter yen amounts to convert to U.S. dollars (0 to quit):");
        while (true) {
            System.out.print("Yen amount: ");
            double yen = scanner.nextDouble();
            if (yen == 0) {
                break; // Sentinel value to stop the input
            }
            double dollars = yen / exchangeRate;
            System.out.println(yen + " yen is " + dollars + " USD.");
        }

        System.out.println("Program terminated.");
    }
}
