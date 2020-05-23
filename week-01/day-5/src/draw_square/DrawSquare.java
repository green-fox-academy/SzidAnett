package draw_square;
import java.util.Scanner;
// Write a program that reads a number from the standard input, then draws a
// square like this:
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
// The square should have as many lines as the number was

public class DrawSquare {
    public static void main(String[] args) {
        System.out.println("Plz, write a number: ");
        Scanner scanner = new Scanner(System.in);
        int square = scanner.nextInt();

        for (int i = 0; i < square; i++) {

            if (i == 0 || i == square - 1) {
                for (int j = 0; j < square; j++) {
                    System.out.print("%");
                }
            } else {
                for (int j = 0; j < square; j++) {
                    if (j == 0 || j == square - 1) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
