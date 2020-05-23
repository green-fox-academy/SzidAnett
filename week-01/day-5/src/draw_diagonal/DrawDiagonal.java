package draw_diagonal;
import java.util.Scanner;
// Write a program that reads a number from the standard input, then draws a
// square like this:
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
// The square should have as many lines as the number was
public class DrawDiagonal {
    public static void main(String[] args) {
        System.out.println("Plz, write a number: ");
        Scanner scanner = new Scanner(System.in);
        int diagonal = scanner.nextInt();

        for (int i = 0; i < diagonal; i++) {
            if (i == 0 || i == diagonal - 1) {
                for (int j = 0; j < diagonal; j++) {
                    System.out.print("%");
                }
            } else {
                for (int j = 0; j < diagonal; j++) {
                    if (j == 0 || j == diagonal - 1 || i == j) {
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
