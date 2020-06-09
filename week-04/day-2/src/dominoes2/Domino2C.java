package dominoes2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Domino2C {
    public static void main(String[] args) {
        List<DominoC> dominoes = initializeDominoes();
        int j;
        for (int i = 1; i < dominoes.size(); i++) {
            j = i;
            while (dominoes.get(i-1).getRightSide() != dominoes.get(j).getLeftSide()){
                j++;
            }
            Collections.swap(dominoes,i,j);
        }
        System.out.println(dominoes);
    }

    static List<DominoC> initializeDominoes() {
        List<DominoC> dominoes = new ArrayList<>();
        dominoes.add(new DominoC(5, 2));
        dominoes.add(new DominoC(4, 6));
        dominoes.add(new DominoC(1, 5));
        dominoes.add(new DominoC(6, 7));
        dominoes.add(new DominoC(2, 4));
        dominoes.add(new DominoC(7, 1));
        return dominoes;
    }
}
