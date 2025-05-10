package DataStructures.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtStart(1);
        list.insertAtEnd(2);
        list.insertAtIndex(1, 3);
        list.insertAtStart(4);
        list.insertAtEnd(5);
        list.print();

        System.out.println("deleting at first");
        list.deleteAtStart();
        list.print();

        System.out.println("deleting at end");
        list.deleteAtEnd();
        list.print();

        System.out.println("deleting at 1");
        list.deleteAtIndex(1);
        list.print();

        System.out.println("deleting at 3");
        list.deleteAtIndex(3);
        list.print();
    }
}
