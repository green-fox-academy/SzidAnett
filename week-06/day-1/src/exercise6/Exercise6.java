package exercise6;

public class Exercise6 {
    public static void main(String[] args) {
        String guildWarsWiki = "The Dragon Arena is a PvP arena set in a modified version of the Imperial Isle guild hall" +
                " that is accessible only during Shing Jea Boardwalk events by talking to Captain Li Sah.";

        guildWarsWiki.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isUpperCase)
                .forEach(System.out::println);
    }
}




