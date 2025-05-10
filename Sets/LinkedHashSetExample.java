//A type of hashset which maintains the insertion order.
package Sets;
import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("mumbai");
        cities.add("pune");
        cities.add("mumbai");
        cities.add("nashik");
        cities.add("bengaluru");
        cities.add("chennai");
        cities.add("delhi");
        cities.add("haryana");
        cities.add("mohali");

        System.out.println(cities);

        //size of hash set
        System.out.println("There are total " + cities.size() + " cities");

        //check if city exist
        System.out.println("Contains mumbai ? " + cities.contains("mumbai"));

        //remove element
        cities.remove("nashik");
        System.out.println("Now the cities are " + cities);

        //we can only iterate over enhanced loop because we can not fetch element based on index
        for (String city : cities) {
            System.out.println(city);
        }

        //empty hashset in one go
        cities.clear();
        System.out.println("Now cities are" + cities);
    }
}
