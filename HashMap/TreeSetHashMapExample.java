//TreeMap is a hashMap which is used to store the data in a sorted order.

package HashMap;
import java.util.*;

public class TreeSetHashMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> marks = new TreeMap<>();

        //add element
        marks.put("atul", 99);
        marks.put("yogi", 98);
        marks.put("ankita", 97);
        marks.put("vishnu", 89);
        marks.put("ajay", 77);
        marks.put("nagya", 83);
        marks.put("sanskaar", 79);

        
        //update an element value
        marks.put("atul", 100);
        System.out.println("Marks are : " + marks);

        //fetch by key name
        System.out.println("Marks atul is : " + marks.get("atul"));

        //fetch all keys
        System.out.println("All students are : " + marks.keySet());

        //fetch all values
        System.out.println("all marks are : " + marks.values() );

        //loop over map using keyset
        for (String name : marks.keySet()) {
            System.out.println(name + " has scored " + marks.get(name) + " marks");
        }

        //check if a keys exits
        System.out.println("Contains atul ?" + marks.containsKey("atul"));
        System.out.println("Contains sushil ?" + marks.containsKey("sushil"));

        //check if value exists
        System.out.println(" Anyone Contains 100 marks ? " + marks.containsValue(100));
        System.out.println(" Anyone Contains 95 marks ? " + marks.containsValue(95));

        //check size
        System.out.println("Size of the map is : " + marks.size());

        //remove an element
        marks.remove("ankita");
        System.out.println("Marks after removing ankita : " + marks);

        //check if map is empty
        System.out.println("Is map empty ? " + marks.isEmpty());

        //clear whole map
        marks.clear();
        System.out.println("Is map empty ? " + marks.isEmpty());


    }
}
