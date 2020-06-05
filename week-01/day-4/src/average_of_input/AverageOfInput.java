package average_of_input;
import java.util.Scanner;
public class AverageOfInput {
    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    // Sum: 22, Average: 4.4
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float sum = 0;
        float userinput;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Plz, write a number: ");
            userinput = scanner.nextInt();
            sum += userinput;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum / 5);
    }
}