import java.util.Random;

public class MontyHallParadox {
    public static void main(String[] args) {
        int rounds = 1000000; // Number of rounds to simulate
        int switchWins = 0;
        int stayWins = 0;
        Random rand = new Random();

        for (int i = 0; i < rounds; i++) {
            // Set up the doors: 0 = goat, 1 = car
            int[] doors = {0, 0, 0}; // All doors have goats initially
            doors[rand.nextInt(3)] = 1; // Randomly place the car behind one door

            // Contestant initially chooses a door
            int contestantChoice = rand.nextInt(3);

            // Host reveals a door with a goat (not the contestant's choice, and not the car)
            int hostChoice = -1;
            for (int j = 0; j < 3; j++) {
                if (j != contestantChoice && doors[j] == 0) {
                    hostChoice = j;
                    break;
                }
            }

            // Contestant has the option to switch doors
            int switchChoice = 3 - contestantChoice - hostChoice; // The remaining unopened door

            // If the contestant switches and the new choice is the car, they win
            if (doors[switchChoice] == 1) {
                switchWins++;
            }
            // If the contestant stays with the original choice and it is the car, they win
            if (doors[contestantChoice] == 1) {
                stayWins++;
            }
        }

        // Print the results
        System.out.println("Switching doors wins: " + switchWins + " times out of " + rounds);
        System.out.println("Staying with original door wins: " + stayWins + " times out of " + rounds);
        System.out.println("Probability of winning by switching: " + (double) switchWins / rounds);
        System.out.println("Probability of winning by staying: " + (double) stayWins / rounds);
    }
}
