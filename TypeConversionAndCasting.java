// Casting - 
    // 1. Explicit Casting - Forcefully converting one data type to another data type
    // 2.Implicit Casting - the data type gets converted to different data type automatically.
    // Implicit casting and type cpnversion are kind of same
public class TypeConversionAndCasting {
    public static void main(String[] args) {
        int a = 257;
        byte b = (byte) a;
        //for above scenerio b will store the modulo of a with 256
        System.out.println(b);

        float f =5.6f;
        int t = (int)f;
        //in the above scenerio t will store the ceil of float value
        System.out.println(t);

        //type promotion
        byte b1 = 10;
        byte b2 = 30;
        int result = b1*b2;
        //in the above example the result is automatically promoted to int, though the multiplication was done between two byte variables;
        System.out.println(result);

    }
    
}
