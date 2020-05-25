package diagonal_matrix;
// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
public class Diagonal_Matrix {
    public static void main(String[] args) {
        int [][] diagonal  = { {1,0,0,0}, {0,1,0,0}, {0,0,1,0}, {0,0,0,1}};

        for (int row=0; row < diagonal.length; row++) {
            for (int col=0; col<diagonal[row].length; col++) {
                System.out.print(diagonal[row][col] + " ");
            }
            System.out.println();
        }

    }
}




