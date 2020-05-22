package fizz_buzz;
// Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.
public class FizzBuzz {
    public static void main(String[] args) {

        for (int f = 1; f < 101; f++) {

            if (f % 3 == 0 && f % 5 == 0) {
                System.out.println(f + " FizzBuzz");
            } else if (f % 5 == 0) {
                System.out.println(f + " Buzz");
            } else if (f % 3 == 0) {
                System.out.println(f + " Fizz"); 
            } else {
                System.out.println(f);
            }
        }

    }
}
