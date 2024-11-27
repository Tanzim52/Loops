import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        // Array to hold the names of the months
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        // Array to hold the temperatures for each month
        double[] temperatures = new double[12];

        Scanner scanner = new Scanner(System.in);

        // Read temperature values for each month
        for (int i = 0; i < 12; i++) {
            System.out.print("Enter the temperature for " + months[i] + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        // Find the month with the highest temperature
        int maxIndex = 0;
        for (int i = 1; i < 12; i++) {
            if (temperatures[i] > temperatures[maxIndex]) {
                maxIndex = i;
            }
        }

        // Print the result
        System.out.println("The month with the highest temperature is " + months[maxIndex]
                + " with a temperature of " + temperatures[maxIndex] + "°.");
    }
}
