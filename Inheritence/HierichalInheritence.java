package Inheritence;

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

public class HierichalInheritence {
    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.eat();
        obj.meow();
    }
}
