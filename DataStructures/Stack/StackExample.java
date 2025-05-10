package DataStructures.Stack;
import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        //push element
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        //see all the element
        System.out.println("All the elements present are : " + st);

        //check the top element
        System.out.println("The top element is : " + st.peek());

        //remove top element
        System.out.println("Removing the top element : " + st.pop());
        System.out.println("Stack after removing the top element : " + st);

        //check if stack is empty
        System.out.println("Is stack empty ? " + st.isEmpty());

        //size of stack
        System.out.println("Size of stack : " + st.size());

    }    
}
