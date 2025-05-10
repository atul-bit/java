package Exceptions;

class MyCustomException extends Exception {
    public MyCustomException (String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        try {
            int age = 17;
            if (age < 18) {
                throw new MyCustomException("Age should be greater than 18");
            }
        } catch (MyCustomException e) {
            System.out.println("Custom error : " + e.getMessage());
        }
    }    
}
