package exercise5;
import java.util.Arrays;
import java.util.List;
public class Exercise5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);


        int s = numbers.stream()
                .filter(n -> n % 2!= 0)
                .mapToInt(n->n)
                .sum();
        System.out.println(s);
    }
}
