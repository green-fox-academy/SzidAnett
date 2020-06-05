package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    public static List<Pirate> crew;
    private Pirate captain;
    private String nameOfShip;

    public Ship(){
        this.crew =  new ArrayList<Pirate>();
        this.nameOfShip = nameOfShip;
    }
    public String getName() {
        return this.nameOfShip;
    }
    public Pirate getCaptain() {
        return this.captain;
    }
    public List<Pirate> getCrew() {
        this.crew.removeIf(crewMember -> Boolean.parseBoolean(crewMember.isDead));
        return this.crew;
    }
    public void fillShip() {
        Random c = new Random();
        int randomCrew = c.nextInt(45)+5;
        for (int i = 0; i < randomCrew; i++) {
            Pirate pirate = new Pirate();
            crew.add(pirate);
        }
        this.captain = new Pirate();
        System.out.println("The " + this.getName() + " has a total crew of " + this.getCrew().size() + " pirates");
    }
}






