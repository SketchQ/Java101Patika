import java.lang.Math;

/* Java program to guess the number
 *
 * @author: Erim Serdönmez
 */

public class GuesstheNumber {

    public static int getGuess() {
        int guess = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print("Enter your guess: ");
            try {
                guess = Integer.parseInt(System.console().readLine());
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        return guess;
    }


    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        int guess = 0;
        int guessCount = 0;
        int guessLimit = 5;
        boolean outOfGuesses = false;
        System.out.println("Guess a number between 0 and 100");
        while (guess != number && !outOfGuesses) {
            if (guessCount < guessLimit) {
                guess = getGuess();
                guessCount++;
                if (guess > number) {
                    System.out.println("Lower");
                } else if (guess < number) {
                    System.out.println("Higher");
                }
            } else {
                outOfGuesses = true;
            }
        }
        if (outOfGuesses) {
            System.out.println("You lose");
        } else {
            System.out.println("You win");
        }

    }
}