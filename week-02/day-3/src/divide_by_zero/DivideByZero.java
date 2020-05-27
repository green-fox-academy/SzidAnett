package divide_by_zero;
import java.util.Scanner;
public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz, give me a number: ");
        int divisor = scanner.nextInt();

        try {

            int result = 12 / divisor;
            System.out.println(result);
            } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");
        }
    }
}
