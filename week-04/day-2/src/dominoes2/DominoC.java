package dominoes2;

public class DominoC implements Comparable<DominoC> {
    private int left;
    private int right;

    public DominoC(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    @Override
    public int compareTo(DominoC d) {
        if (this.getLeftSide()>d.getLeftSide()) return 1;
        if (this.getLeftSide()<d.getLeftSide()) return -1;
        if (this.getRightSide()>d.getRightSide()) return 1;
        if (this.getRightSide()<d.getRightSide()) return -1;
        return 0;
    }
}
