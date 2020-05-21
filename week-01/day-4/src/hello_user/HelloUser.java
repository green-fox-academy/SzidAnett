package hello_user;

import java.util.Scanner;

public class HelloUser {
    public static void main (String [] args){
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! What's your name, plz? ");
        String userinput = scanner.nextLine();
        System.out.println("Thx," + userinput + " !");
    }
}
