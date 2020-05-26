package reverse;


public class Reverse {
    public static void main(String[]args){
    String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        String reverse = "";
        for(int i = toBeReversed.length()-1; i >= 0; i--) {
            reverse = reverse + toBeReversed.charAt(i);
        }
        reverse = reverse.toString();

        System.out.println(reverse);
    }

}

