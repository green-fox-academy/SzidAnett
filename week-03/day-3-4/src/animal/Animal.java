package animal;

public class Animal {
    private int hunger;
    private int thirst;

    public Animal(){
        this.hunger = 50;
        this.thirst = 50;
    }

    public Animal(int hunger, int thirst){

    this.hunger = hunger;
    this.thirst = thirst;

}


    public void eat(){
        this.hunger--;
    }
    public void drink(){
        this.thirst--;
    }

    public void play(){
        this.thirst++;
        this.hunger++;
    }

}



