package sharpie;

public class Sharpie {
    private String color;
    private float width;
    private float inkAmount;

    public Sharpie(String color, float inkAmount, float width) {
        this.color = color;
        this.inkAmount=100.0f;
    }

    public void use(){
        this.inkAmount--;

    }

}
