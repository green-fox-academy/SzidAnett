package product_database;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
public class ProductDatabase {
    public static void main(String[] args) {
        HashMap<String, Integer> item = new HashMap<>();

        item.put("Eggs",200);
        item.put("Milk",200);
        item.put("Fish",400);
        item.put("Apples",150);
        item.put("Bread",50);
        item.put("Chicken",550);


        System.out.println("How much is the fish? " + item.get("Fish"));
        System.out.println("The most expensive product is "+ Collections.max(item.values()));

        String keyWithMinValue = Collections.min(
                item.entrySet(), Entry.comparingByValue()).getKey();
        System.out.println("The cheapest product is: " + keyWithMinValue);


        //boolean item300 = (item.get(item).intValue()>300);
        //System.out.println( item300 == true ? "There is" + item300 + "product with price bellow 300" : "");



        int total = 0;
        for (int number:item.values()){
            total = total + number;
        }
        System.out.println("The avarage price is " + total/  item.size());

        boolean itemX = (item.containsKey(125));
        System.out.println( itemX == true ? "Is there anything we can buy for exactly 125? yes" : "We can't buy anything for exactly 125.");


    }
}

