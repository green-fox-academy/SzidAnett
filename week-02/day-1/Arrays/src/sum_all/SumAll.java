package sum_all;

public class SumAll {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 6, 7};
        int e = 0;

        for (int i = 0; i < numbers.length; i++){
            e += numbers[i];
        }
        System.out.println(e);
        }

    }

