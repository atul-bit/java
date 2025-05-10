// String in java is a class represented  by sequence of characters, 
//hence the keyword String with capital letter due to its class behaviour
//Strings in Java are immutable — once created, their values cannot be changed.
// Every time you modify a string, a new object is created. (string pool)

// For mutable strings (when you need to modify strings often), use:
// StringBuilder (not thread-safe, faster)
// StringBuffer (thread-safe)

public class Strings {
    public static void main(String[] args) {
        String str1  = "Hello"; // using string literal
        String str2 = new String("Hello"); // using new Keyword
        String str3 = "Hello";
        String str4 = new String("Hello");
        
        //above both the methods are same, internally str1 calls the new keyword
        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);
        System.out.println(str1 == str2); // false because str2 is created by new method
        System.out.println(str1 == str3); //true because both points to the same address in string pool
        System.out.println(str2 == str4); // false because both are created by new method


        //Strings in Java are immutable — once created, their values cannot be changed.
        // Every time you modify a string, a new object is created.
        str2 = str2 + " World"; // Creates a new String object
        System.out.println("updated str2 : " + str2);

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer("Hello2");
        System.out.println(sb1);


    }    
}
