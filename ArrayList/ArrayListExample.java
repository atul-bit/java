package ArrayList;
import java.util.*;

public class ArrayListExample{
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("chickoo");
        fruits.add("orange");
        fruits.add("musk melon");

        System.out.println("The size of fruits is : " + fruits.size());
        int size = fruits.size();

        // Running the loop over arraylist using for loop
        for (int i = 0; i < size; i++) {
            System.out.println("At " + i + " is " + fruits.get(i));
        }

        // Running enhanced for looop over arrayList
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        //check if an element exists in an aaray list
        System.out.println("Contains Apple ? " + fruits.contains("apple"));

        // remove an element from an array list
        fruits.remove("chickoo");
        System.out.println("Now fruits are : " + fruits);

        //update an element in the existing array list
        fruits.set(2, "water melon");
        System.out.println("Now fruits are : " + fruits);

    }
}