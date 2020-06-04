package animal;
import java.util.ArrayList;
import java.util.List;
public class Farm {
    public List<Animal> FarmAnimals = new ArrayList<>();
    private int slots = 10;

    public void breed(){
        if(this.FarmAnimals.size() < slots){
            this.FarmAnimals.add(new Animal());
        }
    }
    public void slaughter(){
        int hunger =FarmAnimals.get(0).hunger;
        int toSlaughter = 0;

        for (int i = 0; i < FarmAnimals.size(); i++){
            if(FarmAnimals.get(0).hunger>=hunger){
                hunger = FarmAnimals.get(0).hunger;
                toSlaughter = i;
            }
        }
        FarmAnimals.remove(toSlaughter);
    }
}
