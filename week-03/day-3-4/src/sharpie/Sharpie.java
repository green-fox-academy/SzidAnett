package sharpie;

public class Sharpie {
    private String color;
    private float width;
    private float inkAmount = 100;

    public Sharpie(String color, float inkAmount) {
        this.color = color;
        this.inkAmount = inkAmount;
    }

    public void use(){
        this.inkAmount--;

    }

}
