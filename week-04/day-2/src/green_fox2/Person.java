package green_fox2;

public class Person implements Cloneable{
    protected String name;
    protected int age;
    protected String gender;

    public Person(String name, int age, String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public Person(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String introduce(){
        String introduce =("Hi, I'm " + this.name +", a " + this.age + " years old "+ this.gender + this.specificIntroduce() + ".");
        System.out.println(introduce);
        return introduce;
    }

    public String specificIntroduce() {
        return "";
    }

    public void getGoal(){
        System.out.println("My goal is: Live for the moment!");
    }

}
