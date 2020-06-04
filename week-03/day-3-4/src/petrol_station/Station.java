package petrol_station;

public class Station {

    private int gasAmount;

    public Station (int gasAmount){
        this.gasAmount =gasAmount;
    }
    public int getGasAmount(){
        return gasAmount;
    }
    public void setGasAmount(){
        this.gasAmount = gasAmount;
    }
    public void refill (Car car){
        this.gasAmount -= (car.getGasAmount());
        car.setGasAmount(car.getCapacity() - car.getGasAmount());
    }
}
