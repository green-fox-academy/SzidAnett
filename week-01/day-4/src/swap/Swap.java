package swap;

public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;

        System.out.println("Before swap: a = " + a);
        System.out.println("Before swap: b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a = " + a);
        System.out.println("After swap: b = " + b);
    }
}
