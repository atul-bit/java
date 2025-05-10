package DataStructures.LinkedList;

public class LinkedList {
    private Node head;
    
    public void insertAtStart (int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void insertAtIndex (int index, int data) {
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            insertAtStart(data);
            return;
        }

        int count = 0;
        Node curr = head;
        while (curr != null) {
            if (count == index - 1) {
                break;
            }
            count++;
            curr = curr.next;
        }
        Node newNode = new Node(data);
        Node temp = curr.next;
        curr.next = newNode;
        newNode.next = temp;
    }

    public void deleteAtStart () {
        if (head ==  null) {
            System.out.println("List is already empty");
            return;
        }
        head = head.next;
    }

    public void deleteAtEnd () {
        if (head ==  null) {
            System.out.println("List is already empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node curr = head;
        
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
    }

    public void deleteAtIndex (int index) {
        if (index < 0 || head == null) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            deleteAtStart();
            return;
        }

        int count = 0;
        Node curr = head;
        while (curr.next != null) {
            if (count == index - 1) {
                break;
            }
            count++;
            curr = curr.next;
        }
        if (curr.next == null) {
            System.out.println("Index out of bound");
            return;
        }
        curr.next = curr.next.next;
        
    }

    public void print () {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
