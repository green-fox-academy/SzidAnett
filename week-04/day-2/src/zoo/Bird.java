package zoo;

import java.util.stream.Stream;

public class Bird extends Animal{
    protected int size;
    protected String makeSound;

    public Bird(String name, int age, String gender, String territory, int size, String makeSound ) {
        super(name, age, gender, territory);
        this. size = size;
        this.makeSound = makeSound;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMakeSound() {
        return makeSound;
    }

    public void setMakeSound(String makeSound) {
        this.makeSound = makeSound;
    }

    @Override
    public String eat() {
        return "insects and eggs or seeds and fruits. ";
    }

    @Override
    public String drink() {
        return "water. ";
    }

    @Override
    public String breed() {
        return "laying eggs. ";
    }
}
