package pirates;

import java.util.Collections;

public class Main_Pirate<i> {

    public static void main(String[] args) {
        Pirate pirate = new Pirate();
        Ship ship = new Ship();

        int random = (int) (Math.random() * 11 + 1);
        for (int i = 0; i < random; i++) {
            pirate.drinkSomeRum();
        }
        System.out.println("Drunkenness: " + Pirate.drunkennessMeter);
        System.out.println("HP is: " + Pirate.health);
        pirate.howsItGoingMate();
        pirate.brawl();
        System.out.println(Ship.crew);

    }

}







