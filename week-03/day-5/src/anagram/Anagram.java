package anagram;
        import java.util.Scanner;
public class Anagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz, give me two words that you want to check if they anagrams. First word: ");
        String firstWord = scanner.nextLine();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Plz, give me the second word: ");
        String secondWord = scanner1.nextLine();

        System.out.println(anagram(firstWord,secondWord));

    }
    public static boolean anagram(String firstWord,String secondWord){
        String dogGod ="";
        for (int i = secondWord.length(); i > 0 ; i--) {
            dogGod += secondWord.charAt(i-1);
        }
        if(dogGod.equals(firstWord)){
            return true;

        }else{
            return false;

        }
    }
}
