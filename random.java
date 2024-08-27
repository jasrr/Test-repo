import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Create a Random object to generate a random number
        Random random = new Random();

        // Generate a random number between 1 and 10
        int numberToGuess = random.nextInt(10) + 1;

        // Initialize variables
        int userGuess = 0;
        boolean hasGuessedCorrectly = false;

        // Game loop
        while (!hasGuessedCorrectly) {
            System.out.print("Guess a number between 1 and 10: ");

            // Read user input
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();

                // Check if the guess is correct
                if (userGuess == numberToGuess) {
                    hasGuessedCorrectly = true;
                    System.out.println("Congratulations! You guessed the correct number.");
                } else {
                    System.out.println("Try again.");
                }
            } else {
                System.out.println("Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        }

        // Close the scanner
        scanner.close();
    }
}