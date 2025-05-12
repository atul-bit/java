package Inheritence;

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class SingleInheritence {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.bark();
        obj.eat();
    }
}
