package sum;

import java.util.ArrayList;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();

    fill(numbers);
    System.out.println(

    findSum(numbers));
}
    private List<Integer> list;
    public Sum(){
        list = new ArrayList<Integer>();
    }
    int i = 0;

    public static int findSum(ArrayList<Integer> green) {
        int sum = 0;
        for (int value : green) {
            sum += value;
        }
        return sum;
    }

    public static void fill(ArrayList<Integer> arr) {
        for (int i = 0; i < 10; i++) {
            arr.add(i + 1);
        }

    }
}


