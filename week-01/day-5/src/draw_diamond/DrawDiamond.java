package draw_diamond;
import java.util.Scanner;
// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was

public class DrawDiamond {
    public static void main(String []args){
        System.out.println("Plz, write a number: ");
        Scanner scanner = new Scanner(System.in);
        int diamond = scanner.nextInt();
        int z;

        if (diamond % 2 == 0) {
            z = diamond / 2;
        } else {
            z = (diamond / 2) + 1;
        }

        for (int i = 1; i <= z; i++) {
            for (int j = 1; j <= z- i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < (i * 2); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= z; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < (z - i) * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

