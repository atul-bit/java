class Calculator {
    public int add (int num1, int num2) {
        return num1 + num2;
    }
}


public class BasicClass {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 4;

        Calculator calc = new Calculator();
        System.out.println(calc.add(num1, num2));
    }
}