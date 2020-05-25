package increment_element;
// - Create an array variable named `numbers`
//   with the following content: `[1, 2, 3, 4, 5]`
// - Increment the third element
// - Print the third element
public class IncrementElement {
    public static void main(String[] args) {
        int[] Numbers = {1, 2, 3, 8, 5, 6};
        Numbers[2] = Numbers[2] + 1;
        System.out.println("The third elements is: " + Numbers[2]);
    }
}
