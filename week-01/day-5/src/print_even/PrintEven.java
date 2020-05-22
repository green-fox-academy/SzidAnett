package print_even;

// Create a program that prints all the even numbers between 0 and 500

public class PrintEven {
    public static void main (String [] args){


        for (int e =0; e<=500; e++){
            if(e%2 == 0)
            System.out.println(e);
            e++;
        }

    }
}
