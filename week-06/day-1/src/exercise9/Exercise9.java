package exercise9;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
public class Exercise9 {
    public static void main(String[] args) {
        String guildWarsWiki = "The Dragon Arena is a PvP arena set in a modified version of the Imperial Isle guild hall" +
                " that is accessible only during Shing Jea Boardwalk events by talking to Captain Li Sah.";

        Map<String, Long> frequencyLowerCase = Arrays.stream(guildWarsWiki.toLowerCase().split(""))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        frequencyLowerCase.forEach((key, value) -> System.out.println(key + ":" + value));

        Map<String, Long> frequencyUpperCase = Arrays.stream(guildWarsWiki.toUpperCase().split(""))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        frequencyUpperCase.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
