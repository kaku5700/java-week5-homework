import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

public class Programme9_HashMap {
    public static void main(String[] args) {

        // Hashmap declaration storing String keys and Integer values
        Map<String, Integer> people = new HashMap<>();
        people.put("Jaynika Patel", 1);
        people.put("Hiren Patel", 2);
        people.put("Pinal Shah", 3);
        people.put("Jigna Patel", 4);
        people.put("Darshna Patel", 5);
        people.put("Megha Mehta", 6);

        // Enhanced for loop setting the values and printing them
        for (Map.Entry<String, Integer> list : people.entrySet()) {
            System.out.println(list.getValue() + " " + list.getKey());
        }
    }
}
