package zoo;

public abstract class Animal {
    protected String name;
    protected int age;
    protected String gender;
    protected String territory;

    public Animal (String name, int age, String gender, String territory){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.territory = territory;
    }
    public String eat(){

        return null;
    }

    public String drink() {

        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String breed(){

        return null;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }
}
