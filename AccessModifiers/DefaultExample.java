/*
    Scope: Same package only.
    Also called: Package-private access

    ✅ Accessible in same package
    ❌ Not accessible in another package
 */

package AccessModifiers;

class DefaultExample {
    int value = 30;

    void show() {
        System.out.println("Default Method: " + value);
    }
}
