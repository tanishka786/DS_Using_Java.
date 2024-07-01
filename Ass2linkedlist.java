// Node class definition
class Node {
    private String data;
    private Node next;

    public Node(String data) {
        this.data = data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public String getData() {
        return this.data;
    }

    public Node getNext() {
        return this.next;
    }
}

// LinkedList class definition
class LinkedList {
    private Node head;
    private Node tail;

    public Node getHead() {
        return this.head;
    }

    public Node getTail() {
        return this.tail;
    }

    public void addAtEnd(String data) {
        Node node = new Node(data);

        if (this.head == null) {
            this.head = this.tail = node;
        } else {
            this.tail.setNext(node);
            this.tail = node;
        }
    }

    public void display() {
        Node temp = this.head;

        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public void reverse() {
        this.head = reverseRecursive(this.head);
    }

    private Node reverseRecursive(Node current) {
        if (current == null || current.getNext() == null) {
            return current;
        }

        Node reversedHead = reverseRecursive(current.getNext());

        current.getNext().setNext(current);
        current.setNext(null);

        return reversedHead;
    }
}

// Tester class definition containing the main method
public class Tester {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtEnd("Data");
        linkedList.addAtEnd("Structures");
        linkedList.addAtEnd("and");
        linkedList.addAtEnd("Algorithms");

        System.out.println("Original linked list:");
        linkedList.display();

        linkedList.reverse();

        System.out.println("Reversed linked list:");
        linkedList.display();
    }
}
