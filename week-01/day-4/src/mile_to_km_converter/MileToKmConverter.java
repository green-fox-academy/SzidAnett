package mile_to_km_converter;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter miles: ");
                float userinp = scanner.nextFloat();

                System.out.println(userinp+" miles = "+(userinp*1.609344)+" kilometres");
            }






    }

