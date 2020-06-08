package garden;

public class Flower extends Plant{
    public Flower(String color, double waterMeter) {
        super(color, waterMeter);
        this.waterConsumption = 0.75;
        this.parched = 5;
    }
}

