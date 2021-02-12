import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        int guess, number;
        final int MAX = 100;

        Scanner secret = new Scanner(System.in);
        Random arbitrary = new Random();

        number = 1 + arbitrary.nextInt(MAX);
        for (int i = 0; i < 5; i++) {
            System.out.println("Guess a number greater than 1 but less than 100");
            guess = secret.nextInt();

            if (guess == number) {
                System.out.println("You won!");
            } else if (guess < number) {
                System.out.println("The number is lower"); //outputs when user guesses lower than number
            } else if (guess > number) {
                System.out.println("The number is higher"); //outputs when user guesses number higher
                break;
            }
            if (i == 4) {
                System.out.println("You lose, the number was:" + number);
                break;
            }
        }
    }
}

