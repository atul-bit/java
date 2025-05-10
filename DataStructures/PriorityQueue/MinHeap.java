package DataStructures.PriorityQueue;
import java.util.*;

public class MinHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(3);
        minHeap.offer(2);
        minHeap.offer(6);
        minHeap.offer(1);
        minHeap.offer(8);

        //see all the elements of an queue
        System.out.println("The elements in min heap are : " + minHeap);

        //check if heap is empty
        System.out.println("Is heap empty ? " + minHeap.isEmpty());

        //cheack top element
        System.out.println("Top element is : " + minHeap.peek());

        //remove top elelment
        System.out.println("Removing top element : " + minHeap.poll());
        System.out.println("After removing the queue is : " + minHeap);

    }    
}
