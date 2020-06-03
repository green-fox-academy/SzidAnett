import post_it.PostIt;

import static java.awt.Color.*;

public class Main {

    public static void main(String[] args) {
	// Create a few example post-it objects:
        //an orange with blue text: "Idea 1"
        //a pink with black text: "Awesome"
        //a yellow with green text: "Superb!"

        PostIt myPostItOrange = new PostIt("ORANGE", "Idea 1", "BLUE");
        PostIt myPostItPink = new PostIt("PINK", "Awesome", "BLACK");
        PostIt myPostItYellow = new PostIt("YELLOW", "Superb!", "GREEN");

        
        System.out.println(myPostItOrange.getBackgroundColor());

    }
}
