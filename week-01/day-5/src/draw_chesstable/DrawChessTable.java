package draw_chesstable;
//Crate a program that draws a chess table like this
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
public class DrawChessTable {
    public static void main(String[] args) {
        int rook = 8;

        for (int i = 2; i < rook + 2; i++) {
            if (i % 2 == 0) {
                for (int z = 2; z < rook + 2; z++) {

                    if (z % 2 == 0) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                for (int x = 2; x < rook + 2; x++) {
                    if (x % 2 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("%");
                    }
                }
            }
            System.out.println();
        }
    }
}
