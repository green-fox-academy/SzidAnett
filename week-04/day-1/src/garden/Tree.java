package garden;

public class Tree extends Plant{
    public Tree(String color, double waterMeter) {
        super(color, waterMeter);
        this.waterConsumption = 0.40;
        this.parched = 10;
    }

}
