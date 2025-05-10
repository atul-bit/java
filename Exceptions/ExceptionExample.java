package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int a = 18/0;
            FileReader file = new FileReader("example.txt");
            throw new Error("Throwing my error");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero !!");
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        } catch (Exception e) {
            System.out.println("Other exception handled");
        }
    }
}