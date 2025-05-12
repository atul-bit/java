
//Static variable/method are class variable/method that are shared between different objects.
// They can be accessed without creating an object of that class.
// static are mostly accessed by using class name like : Mobile.type
// where Mobile is a class name and type is a static variable.

//static variable/methods have different memory which shared by different objects of same class.

//There is a static block which is used to intialize static variable or execute code once when the class is loaded into memory, before any objects
// are created or the main() method is run.

/** ---------------------- MOST IMPORTANT ----------------------------- */
//non static method can invoke static variable/method but static method can only invoke static method/variable.
// To invoke the non static varaible, we need to pass the class type or object type of the non static variable/method.

class Mobile {

    String brand;
    int price;
    static String type;

    static {
        System.out.println("will be called only once");
        type = "smart phone";
    }

    public void show () {
        System.out.println(brand + " : " + price + " : " + type);
    }

    public static void show1(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + type);
        //show()  -> will give error as show() is not static
    }

    public static void show3 () {
        System.out.println("Static method called");
    }
}


public class StaticExample {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 200;

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 400;
        obj1.show();
        obj2.show();

        // invoking static methods
        Mobile.show3();
        Mobile.show1(obj2);
    }
}
