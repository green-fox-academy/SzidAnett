package write_multiple_lines;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Plz, give me a file to write: ");
        String filename = scanner.next();
        System.out.println("Plz, give me a random word: ");
        String word = scanner.next();
        System.out.println("Plz, give me a random number: ");
        int number = scanner.nextInt();

        writeFile(filename, word, number);
    }
    public static void writeFile(String filename, String word, int number){
        List<String> content = new ArrayList<>();
        for (int i =0; i< number; i++){
            content.add(word);
        }
        try{
            Path filePath = Paths.get(filename);
            Files.write(filePath, content);
        } catch (IOException e){
            System.exit(2);
        }
    }

}
