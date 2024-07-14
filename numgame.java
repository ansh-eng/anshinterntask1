import java.util.Random;
import java.util.Scanner;

public class numgame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int point = 0;
        int matchwon = 0;

        while (true) {
            int maxAttempts = 6;
            int attempts = 0;
            int ToGuess = random.nextInt(100) + 1;

            System.out.println("Hey! Welcome to the Game");
            System.out.println("think a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guessno = sc.nextInt();
                attempts++;
                sc.close();

                if (guessno == ToGuess) {
                    System.out.println(" Bravooooo! You made it " + attempts + " attempts.");
                    point += maxAttempts - attempts;
                    matchwon++;
                    break;
                } else if (guessno < ToGuess) {
                    System.out.println("num is less than exact num ! Try again.");
                } else {
                    System.out.println("num is higher than exact num ! Try again.");
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Better luck next time. The number was " + ToGuess);
            }

            System.out.print("Do you want to play again? (y/n): ");
            String response = sc.next();

            if (response.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("Your final score is " + point + " points.");
        System.out.println("You won " + matchwon + " rounds.");
    }
}