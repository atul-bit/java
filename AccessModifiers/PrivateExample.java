/**
    Scope: Within the same class only.
    Used for: Data hiding and encapsulation.

    ✅ Accessible inside the class
    ❌ Not accessible outside (even in the same package)
*/

package AccessModifiers;


public class PrivateExample {
    private int value = 40;

    private void show() {
        System.out.println("Private Method: " + value);
    }

    // Public bridge method
    public void accessPrivate() {
        System.out.println("Accessing privateVar = " + value);
        show();
    }
}

