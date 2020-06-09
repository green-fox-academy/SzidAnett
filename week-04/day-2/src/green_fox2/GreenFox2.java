package green_fox2;

public class GreenFox2 {
    public static void main(String[]args) throws CloneNotSupportedException {
        Student jani = new Student("John", 20, "male", "BME");
        Student john = (Student) jani.clone();
        john.name = "Johnny";
        john.introduce();
        jani.introduce();


    }
}
