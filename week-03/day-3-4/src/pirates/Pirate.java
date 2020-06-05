package pirates;

public class Pirate {

    public static int health;
    public static int drunkennessMeter;
    public String isDead;
    public String isAlive;

    public Pirate() {
        this.health = 1000;
        this.drunkennessMeter = 0;
    }
    String state;
    {
        if (health == 0) state = isDead;
        else state = isAlive;
    }
    public Pirate(int health, int drunkennessMeter) {

        this.health = health;
        this.drunkennessMeter = drunkennessMeter;
    }
    public void drinkSomeRum() {
        //intoxicates the Pirate some
        if (health== 0) {
            System.out.println("Parrot: Your pirate is dead!");
        } else {
            this.health--;
            this.drunkennessMeter++;

            System.out.println("Parrot: Your pirate has drunk some Rum!");
        }
    }
    public void sleep() {
        if (health == 0) {
            System.out.println("Parrot: Your pirate is dead!");
        } else {
            this.health = 1000;
            this.drunkennessMeter = 0;
        }
    }
    public void howsItGoingMate() {
        if (health == 0) {
            System.out.println("Parrot: Your pirate is dead!");
        } else if (drunkennessMeter < 4) {
            drinkSomeRum();
            System.out.println("Pirate: Pour me anudder!");
        } else {
            sleep();
            System.out.println("Pirate: Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            System.out.println("Drunkenness: Your pirate has passed out!");
        }
    }
    public void die() {
        this.health = 0;
    }
    public void brawl() {
        //where pirate fights another pirate (if that other pirate is alive)
        // and there's a 1/3 chance, 1 dies, the other dies or they both pass out.
        int random = (int) (Math.random() * 3) + 1;
        if (random == 1) {
            System.out.println("Parrot: Your pirate is dead!");
            die();
        } else if (random == 2){
            System.out.println("Fight: The other pirate has died!");
        } else {
            System.out.println("Fight: Both pirates have passed out!");
            sleep();
        }
    }

    public class Parrot {

    }
}



