package reverse_list;

public class ReverseList {
    public static void main(String[] args) {
        int[] numbers1 = {3, 4, 5, 6, 7};
        int[] numbers2 = new int[5];


        for (int i = 0; i < numbers1.length; i++) {
        numbers2[i] = numbers1[numbers1.length-1-i]; }
        numbers1 = numbers2;
        for (int i = 0; i < numbers1.length; i++) {
        System.out.println(numbers1[i]);
        }
    }
}