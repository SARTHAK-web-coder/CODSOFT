// 1. Generate a random number within a specified range, such as 1 to 100.
// 2. Prompt the user to enter their guess for the generated number.

// 3. Compare the user's guess with the generated number and provide feedback on whether the guess
// is correct, too high, or too low.

// 4. Repeat steps 2 and 3 until the user guesses the correct number.

// You can incorporate additional details as follows:
// 5. Limit the number of attempts the user has to guess the number.
// 6. Add the option for multiple rounds, allowing the user to play again.
// 7. Display the user's score, which can be based on the number of attempts taken or rounds won.

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Number Guessing Game. ");
        System.out.println("Enter a number from 1 to 100 :");
        Random random = new Random();
        int RandomNumber = random.nextInt(100) + 1;
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            int input = sc.nextInt();
            if (input == RandomNumber) {
                System.out.println("Correct! You guessed the number.");
                System.out.println("You guess the number in " + (count + 1) + " attempts.");
                System.out.println("Game Over!");
                break;
            }
            if (input > RandomNumber) {
                System.out.println("Guess is high.");
                count++;
            } else {
                System.out.println("Guess is low.");
                count++;
            }
        }
    }
}

