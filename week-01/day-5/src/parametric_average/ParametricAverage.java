package parametric_average;
import java.util.Scanner;
// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
// Sum: 22, Average: 4.4
public class ParametricAverage {
    public static void main(String[] args) {
        System.out.println("Plz, write a number: ");
        Scanner scanner = new Scanner(System.in);
        float w = scanner.nextFloat();
        float z = 0;

    for (int i = 1;i < w+1;i++){
        System.out.println("Plz, write a new number: ");
        Scanner scanner1 = new Scanner(System.in);
        z += scanner1.nextFloat();

    }
    System.out.println("Sum: " + z);
    System.out.println("Average: " + z/w);
    }
}

