package garden;

public class Main {
    public static void main(String[] args) {
        Garden firstGarden = new Garden();

        Flower yellowFlower = new Flower("yellow", 1);
        Flower blueFlower = new Flower("blue", 1);
        Tree purpleTree = new Tree("purple", 1);
        Tree orangeTree = new Tree("orange", 1);

        firstGarden.addFlower(yellowFlower);
        firstGarden.addFlower(blueFlower);
        firstGarden.addTree(purpleTree);
        firstGarden.addTree(orangeTree);

        firstGarden.getIndicator();
        System.out.println();
        firstGarden.watering(40);
        System.out.println();
        firstGarden.watering(70);
    }
}
