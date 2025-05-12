class Demo {
    String name;
    Demo (String exampleName) {
        this.name = exampleName;
    }

    public void show () {
        System.out.println("name is : " + name);
    }
}

public class PlayGround {
    public static void main(String[] args) {
        Demo obj1 = new Demo("atul");
        obj1.show();

        Demo obj2 = new Demo("yogi");
        obj2.show();
    }
}
