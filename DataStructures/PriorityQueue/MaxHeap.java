package DataStructures.PriorityQueue;
import java.util.*;

public class MaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.offer(3);
        maxHeap.offer(2);
        maxHeap.offer(6);
        maxHeap.offer(1);
        maxHeap.offer(8);

        //see all the elements of an queue
        System.out.println("The elements in min heap are : " + maxHeap);

        //check if heap is empty
        System.out.println("Is heap empty ? " + maxHeap.isEmpty());

        //cheack top element
        System.out.println("Top element is : " + maxHeap.peek());

        //remove top elelment
        System.out.println("Removing top element : " + maxHeap.poll());
        System.out.println("After removing the queue is : " + maxHeap);

    }    
}
