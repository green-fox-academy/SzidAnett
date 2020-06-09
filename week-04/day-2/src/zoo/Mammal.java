package zoo;

public class Mammal extends Animal{
    protected int legs;
    protected String home;
    protected String foodType;




    public Mammal(String name, int legs, String home, String foodType, int age, String gender, String territory) {
        super(name, age, gender, territory);
        this.legs = legs;
        this.home = home;
        this.foodType = foodType;

    }

    @Override
    public String breed() {
       return "pushing miniature versions out.";
    }

    @Override
    public String drink() {
        return "drinks water. ";
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
}
