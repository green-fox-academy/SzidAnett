package zoo;

public class Reptile extends Animal{
    protected int temperature;
    protected String color;


    public Reptile(String name, int age, String gender, String territory, int temperature, String color ) {
        super(name, age, gender, territory);
        this.color = color;
        this.temperature = temperature;
    }

    @Override
    public String breed() {
        return "laying eggs. ";
    }

    @Override
    public String drink() {
        return "drinks water. ";
    }

    @Override
    public String eat() {
        return "insects and small mammals ";
    }
}
