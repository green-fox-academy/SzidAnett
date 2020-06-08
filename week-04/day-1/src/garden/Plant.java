package garden;

public class Plant {
    protected String color;
    protected double waterMeter;
    protected double waterConsumption;
    protected double parched;

    public Plant(String color, double currentWaterLevel) {
        this.color = color;
        this.waterMeter = currentWaterLevel;
    }

    public boolean isNeedsWater() {
        return this.waterMeter < this.parched;
    }
}






