/*
    Scope: Same package + subclasses (even in other packages)
    Used for: Inheritance with restricted access

    ✅ Accessible in same package
    ✅ Accessible in subclass outside package
    ❌ Not accessible by non-subclass in another package
 */
package AccessModifiers;

public class ProtectedExample {
    protected int value = 20;

    protected void show() {
        System.out.println("Protected Method: " + value);
    }
}
