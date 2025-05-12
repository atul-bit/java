package AccessModifiers;

public class Main {
    public static void main(String[] args) {
        PublicExample pub = new PublicExample();
        pub.show();

        ProtectedExample prot = new ProtectedExample();
        prot.show(); 

        DefaultExample def = new DefaultExample();
        def.show(); 

        PrivateExample priv = new PrivateExample();
        // priv.show(); // ❌ Cannot access private method
        priv.accessPrivate(); // ✅ Allowed via public method
    }
}
