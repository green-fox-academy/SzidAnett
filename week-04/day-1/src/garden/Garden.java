package garden;

import java.util.ArrayList;

public class Garden {

    private ArrayList<Plant> plants;

    public Garden() {

        this.plants = new ArrayList<Plant>();
    }


    public void addFlower(Flower flower) {
        this.plants.add(flower);
    }
    public void addTree(Tree tree) {
        this.plants.add(tree);
    }

    public void getIndicator() {
        for (Plant plant : this.plants) {
            System.out.println("The " + plant.color + " " + plant.getClass().getSimpleName() +
                    (plant.isNeedsWater() ? " needs water" : " doesn't need water"));
        }
    }
    public ArrayList<Plant> getThirstyPlants() {
        ArrayList<Plant> thirsty = new ArrayList<Plant>();
        for (Plant plant : this.plants) {
            if (plant.isNeedsWater()) {
                thirsty.add(plant);
            }
        }
        return thirsty;
    }
    public void watering(int waterAmount) {
        System.out.println("Watering with " + waterAmount);
        for (Plant plant : getThirstyPlants()) {
            plant.waterMeter +=
                    (double) (waterAmount / getThirstyPlants().size()) * plant.waterConsumption;
        }
        getIndicator();
    }
}






