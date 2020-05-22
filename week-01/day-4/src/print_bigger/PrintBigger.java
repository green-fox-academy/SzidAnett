package print_bigger;

import javax.swing.*;
import java.util.Scanner;
// Write a program that asks for two numbers and prints the bigger one
public class PrintBigger {
    public static void main(String[] args) {
        System.out.println("Plz, write a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Plz, write a number: ");
        Scanner scanner1 = new Scanner(System.in);
        int number1 = scanner1.nextInt();

        if (number > number1) {
            System.out.println(number + " is the bigger one!");
        } else if (number1 > number) {
            System.out.println(number1 + " is the bigger one!");

        } else {
            System.out.println("It's equal!");
        }

    }
}
