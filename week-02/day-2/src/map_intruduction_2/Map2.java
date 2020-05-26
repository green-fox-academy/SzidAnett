package map_intruduction_2;
import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {
        HashMap<String, String> map2 = new HashMap<>();

    map2.put("978-1-60309-452-8", "A Letter to Jo");
    map2.put("978-1-60309-459-7", "Lupus");
    map2.put("978-1-60309-444-3","Red Panda and Moon Bear");
    map2.put("978-1-60309-461-0", "The Lab");

        for(Map.Entry<String, String> m: map2.entrySet()) {
            System.out.println(m.getValue()+" (ISBN: "+m.getKey()+")");
        }
        map2.remove("978-1-60309-444-3");
        map2.remove("978-1-60309-461-0");
        map2.put("978-1-60309-450-4", "They Called Us Enemy");
        map2.put("978-1-60309-453-5", "Why Did We Trust Him?");

        boolean mapX = (map2.containsKey("478-0-61159-424-8"));
        System.out.println( mapX == true ? "Map contains key ["+"478-0-61159-424-8"+"]" : "There isn't an associated value with key 478-0-61159-424-8");

        System.out.println(map2.get("978-1-60309-453-5"));
        //System.out.println(map2);
    }
}
