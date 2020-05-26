package takes_longer;

public class TakesLonger {
    public static void main(String []args) {
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
    String q1 = quote.substring(0,21);
    String q2 = ("always takes longer than");
    String q3 = quote.substring(20);

    StringBuilder quoteFinal = new StringBuilder(q1 + q2 +q3);
    quote = quoteFinal.toString();
    System.out.println(quote);
    }
}
