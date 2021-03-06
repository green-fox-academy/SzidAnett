package write_single_line;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class WriteSingleLine {
    public static void main(String[] args) {
        List<String> content = new ArrayList<>(Arrays.asList("Szid"));
        try {
            Path filePath = Paths.get("my-file2.txt");
            if (Files.notExists(filePath)) {
                System.out.println("File not found, trying to create it...");
            }
            Files.write(filePath, content);
            System.out.println("Done");
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file2.txt ");
        }
    }
}
