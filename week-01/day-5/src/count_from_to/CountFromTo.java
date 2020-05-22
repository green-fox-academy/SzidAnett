package count_from_to;
import java.util.Scanner;
// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

public class CountFromTo {
    public static void main (String []args){
        System.out.println("Plz, write a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Plz, write an other number: ");
        Scanner scanner1 = new Scanner(System.in);
        int number1 = scanner1.nextInt();

       if (number >= number1){
            System.out.println("The second number should be bigger!");

        } else {
           for (int i = number; i < number1; i++){
               System.out.println(i);
           }
       }




    }
}
