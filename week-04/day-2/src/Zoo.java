
import zoo.Bird;
import zoo.Mammal;
import zoo.Reptile;


public class Zoo {
    public static void main(String[] args) {

        Reptile reptile = new Reptile("Crocodile", 75, "male", "water", 30, "green");
        Mammal mammal = new Mammal("Koala", 5, "Astralia", "plants", 5, "female", "land");
        Bird bird = new Bird("Parrot", 3, "male", "air", 1,"Hello, Pityuka vagyok!");

        System.out.println("How do you breed?");
        System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed());
        System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed());
        System.out.println("A " + bird.getName() + " is breeding by " + bird.breed());
    }
}
