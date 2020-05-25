package swap;

public class Swap {
    public static void main(String[] args) {
        String[] orders = {"first", "second", "third"};

        String swap = orders[0];
        orders[0] = orders[2];
        orders[2] = swap;
    }
}
