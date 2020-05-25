package factorio;
import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz, write a number and I will give you the factorial: ");
        int f = scanner.nextInt();

        System.out.println(DeFacto(f));
    }
    public static int DeFacto (int e){
        int facto = 1;
        for (int i = 1; i <= e; i++){
            facto *= i;
        }
        return facto;
    }
}
