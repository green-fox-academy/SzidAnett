package green_fox_inheritance_exercise;

public class Student extends Person {
    private String previousOrganization;
    private int skippedDays;


    public Student (String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;

    }

    public Student() {
        super();
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }
    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer");
    }

    @Override
    public String specificIntroduce() {
        return " from " + this.previousOrganization + " who skipped " + skippedDays +" days";
    }

    public void skipDays(int days) {
        this.skippedDays += days;
    }
}
