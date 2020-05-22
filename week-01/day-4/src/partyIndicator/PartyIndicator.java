package partyIndicator;

import java.util.Scanner;

public class PartyIndicator {

    public static void main (String[]args){
        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party, the
        // second the boys
        System.out.println("Number of girls: ");
        Scanner scanner = new Scanner (System.in);
        int girls = scanner.nextInt();
        System.out.println("Number of boys: ");
        Scanner scanner1 = new Scanner(System.in);
        int boys = scanner1.nextInt();


        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people
        if (girls == 0) {
            System.out.println("Sausage party");
            // It should print: The party is excellent!
            // If the the number of girls and boys are equal and 20 or more people are coming to the party
        } else if ((boys == girls) && ((boys + girls) > 20)){
            System.out.println("The party is excellent!");
        }
            // It should print: Average party...
            // If there are less people coming than 20
            else if ((girls + boys) < 20) {
            System.out.println("Average party...");
            // It should print: Quite cool party!
            // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
            //
        } else
            System.out.println("Quite cool party!");
        }


        }






