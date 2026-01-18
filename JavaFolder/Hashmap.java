import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {

        HashMap<String, Double> map = new HashMap<>();

        map.put("Pizza", 500.0);
        map.put("Burger", 150.0);
        map.put("Pasta", 250.0);
        map.put("Salad", 100.0);

        System.out.println(map);
        // Remove the entry with key "Salad"
        map.remove("Salad");
        //Get method
        double a = map.get("Pizza");
        System.out.println("Price of Pizza: " + "$" + a) ;


        System.out.println(map);

        //Contains Key
        boolean b = map.containsKey("Burger");
        System.out.println("Is Burger present? " + b);
        

        //Contains Value
        boolean c = map.containsValue(250.0);
        System.out.println("Is there any item with price $250? " + c);
        

        //Size of the HashMap
        int size = map.size();
        System.out.println("Size of the HashMap: " + size);


        //Iterating through the HashMap
        for(String key : map.keySet()) {
            System.out.println("Item: " + key + ", Price: $" + map.get(key));

        }
    }
}
