package dominoes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Domino2 {

    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
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

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}

