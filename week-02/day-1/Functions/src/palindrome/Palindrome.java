package palindrome;
import javax.swing.*;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz, give me a word: ");
        String word = scanner.nextLine();

        System.out.println(createPalindrome(word));

    }
    public static String createPalindrome(String xy) {
        String palindrome = "";
        for (int i = xy.length()-1; i>=0; i--){
            palindrome += xy.charAt(i);

    }
        String root = xy + palindrome;
        return root;

    }

}