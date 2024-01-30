import java.util.Random;
import java.util.Scanner;

class NumberGame {
    private int secretNumber;
    private int maxRange;

    public NumberGame(int maxRange) {
        this.maxRange = maxRange;
        generateSecretNumber();
    }

    private void generateSecretNumber() {
        Random random = new Random();
        secretNumber = random.nextInt(maxRange) + 1;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("Try to guess the number between 1 and " + maxRange);

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }

        } while (guess != secretNumber);

        scanner.close();
    }
}

public class GameMain {
    public static void main(String[] args) {
        // Create a NumberGame instance with a maximum range of 10
        NumberGame game = new NumberGame(10);

        // Start the game
        game.play();
    }
}
