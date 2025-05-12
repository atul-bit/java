/**  
 * super methods are used to invoke the constructor their parent class.
 * super () -> used to invoke the default constructor of parent class.
 * super (n) -> used to invoke the parameter constructor of parent class.
*/

class A {
    A() {
        System.out.println("Default construcor of a is called");
    }

    A(int a) {
        System.out.println("Paramterized constructor of a is called");
    }
}

class B extends A {
    B() {
        super();
        System.out.println("Default construcor of b is called");
    }

    B(int b) {
        System.out.println("Paramterized constructor of b is called");
    }
}

public class SuperExample {
    public static void main(String[] args) {
        B obj1 = new B();
    }    
}
