package Inheritence;

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps.");
    }
}

public class MultilevelInheritence {
    public static void main(String[] args) {
        Puppy obj = new Puppy();
        obj.eat();
        obj.bark();
        obj.weep();
    }
}
