/**
 * Constructors are the methods of class name which are generally used to do some budiness logic while the object creation.
    These methods doesn't returns anything.
    There are two types of constructors : 
    1.Default Constructors -> constructors called without paramters.
    2.Parameterized Constructors -> constuctors called with parameters
*/

class Human {
    public int age;
    public String name;

    Human() {
        name = "atul";
        age = 24;
        System.out.println("Default construtor called");
    }

    Human(int age, String name) {
        this();
        // this(1,2,34); -> at a time we can call only this method for invoking other constructor.
        this.age = age;
        this.name = name;
    }

    Human(int a, int b, int c) {
        System.out.println("third constructor called --> " + a + " " + b + " " + c);
    }
}


public class Constructors {
    public static void main(String[] args) {
        Human obj1 = new Human();
        Human obj2 = new Human(23, "yogi");
        System.out.println(obj1.name + " is : " + obj1.age);
        System.out.println(obj2.name + " is : " + obj2.age);

    }
}
