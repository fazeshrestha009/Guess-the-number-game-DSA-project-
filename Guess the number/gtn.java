import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        // Create Scanner and Random objects
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Define the range for the random number
        int lowerBound = 1;
        int upperBound = 100;
        
        // Generate a random number within the range
        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
        // Initialize variables for the game
        int guess = 0;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;
        
        // Game loop
        System.out.println("Welcome to Guess the Number!");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ". Try to guess it!");

        while (!hasGuessedCorrectly) {
            // Prompt the user for their guess
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            // Check the user's guess
            if (guess < lowerBound || guess > upperBound) {
                System.out.println("Please enter a number between " + lowerBound + " and " + upperBound + ".");
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
