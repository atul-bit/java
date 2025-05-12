//when variables (private) are encapsulated or bind with their methods, this process is called encapsulation.
// getters and setters comes in picture here.Both are methods.
// getters are used to get the data/variable.
// setters are used to set the dat/variable.

class Human {
    private int age;
    private String name;

    public void setAge (int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setName (String n) {
        name = n;
    }
 
    public String getName() {
        return name;
    }
} 

public class Encapsulation {
    public static void main(String[] args) {
        Human obj1 = new Human();
        obj1.setAge(30);
        obj1.setName("atul");

        System.out.println(obj1.getName() + " is : " + obj1.getAge());
    }
}
