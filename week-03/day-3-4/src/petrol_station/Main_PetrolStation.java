package petrol_station;

public class Main_PetrolStation {
    public static void main(String[] args) {
        Car car = new Car(100, 0);
        Station petrolStation = new Station(1000);
        petrolStation.refill(car);
        System.out.println(car.getGasAmount());
        System.out.println(petrolStation.getGasAmount());

    }
}
