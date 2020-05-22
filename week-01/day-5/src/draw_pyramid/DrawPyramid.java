package draw_pyramid;
import java.util.Scanner;
// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//    *
//   ***
//  *****
// *******
// The pyramid should have as many lines as the number was

public class DrawPyramid {
    public static void main(String []args){
        System.out.println("Plz, write a number: ");
        Scanner scanner = new Scanner(System.in);
        int pyramid = scanner.nextInt();

        for (int i = 1; i < pyramid +1; i++){
            for (int j = 0; j < (pyramid+1)-i; j++) {
                System.out.print(" ");
            }
            for (int z = 0; z < i*2 - 1; z++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
