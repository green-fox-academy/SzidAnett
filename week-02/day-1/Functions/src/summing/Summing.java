package summing;
import java.util.Scanner;

public class Summing {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz, write a number: ");
        int number = scanner.nextInt();

        System.out.println("Sum of numbers from 0 to " + number + ": " + sum(number));
    }
    public static int sum(int d){
        int c = 0;
        for (int i =0; i <= d; i++){
            c += i;
        }
        return c;
    }

}
