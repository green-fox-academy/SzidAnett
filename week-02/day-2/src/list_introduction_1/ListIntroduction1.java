package list_introduction_1;

import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main(String[]args){
        ArrayList<String> list1 = new ArrayList<String>();
        System.out.println(list1.size());
        list1.add("William");
        System.out.println(list1.isEmpty());
        list1.add("John");
        list1.add("Amanda");
        System.out.println(list1.size());
        System.out.println(list1.get(2));

        for(String name: list1) {
            System.out.println(name);
        }
        for(int i=0; i< list1.size(); i++) {
            System.out.println(i+1 + "." + list1.get(i));
        }
        list1.remove(1);

        for(int i = list1.size()-1; i>=0; i--){
            System.out.println(list1.get(i));
        }
        list1.removeAll(list1);
        System.out.println(list1.size());

    }

}
