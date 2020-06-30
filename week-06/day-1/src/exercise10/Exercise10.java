package exercise10;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Exercise10 {
    public static void main(String[] args) {
        List<Fox> kitsuneList = Arrays.asList(
                new Fox("kitsuneAiko", Color.GREEN, 12),
                new Fox("kitsuneFujie", Color.RED, 35),
                new Fox("kitsuneKimiko", Color.YELLOW, 13),
                new Fox("kitsuneAyako", Color.GREEN, 3),
                new Fox("kitsuneKazumi", Color.PURPLE, 10),
                new Fox("kitsuneMidori", Color.BLUE, 15),
                new Fox("kitsuneAsumi", Color.PINK, 20));


        kitsuneList.stream()
                .filter(f -> f.getColor() == Color.GREEN)
                .forEach(f -> System.out.println(f.getName()));

        kitsuneList.stream()
                .filter(f -> f.getColor() == Color.GREEN)
                .filter(f -> f.getAge() < 5)
                .forEach(f -> System.out.println(f.getName()));

        Map<Color, Long> frequency = kitsuneList.stream()
                .collect(Collectors.groupingBy(f -> f.getColor(), Collectors.counting()));

        System.out.println(frequency.entrySet());
    }
}
