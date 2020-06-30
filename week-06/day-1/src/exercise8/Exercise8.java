package exercise8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
    public static void main(String[] args) {
        List<Character> charList = Arrays.asList('M', 'y', ' ', 'n', 'a', 'm', 'e', ' ', 'i', 's', ' ', 'S', 'z', 'i', 'd', '!');

        String output = charList.stream()
                .map(Object::toString)
                .collect(Collectors.joining(""));

        System.out.println(output);
    }
}
