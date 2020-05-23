package guess_the_number;
import java.util.Scanner;
// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
// The stored number is higher
// The stried number is lower
// You found the number: 8
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 8;
        int x;

        do {
            System.out.print("Try guess the hiding number: ");
            x = scanner.nextInt();

            if (x < number) {
                System.out.println("The stored number is higher!");
            } else if (x > number) {
                System.out.println("The stored number is lower!");
            } else {
                System.out.println("You found the number: " + number);
            }
        } while (x != number);
    }
}

