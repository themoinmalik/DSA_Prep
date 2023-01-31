package src.linkedList;

public class DoubleLL {

    Node head;
    Node tail;
    int size;


    public void insertFirst(int data) {

        Node newNode = new Node(data);  // by default next and prev is null...

        newNode.next = head;
        newNode.prev = null;

        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;

    }

    public void insert(int data, int index) {

        Node newNode = new Node(data);

        Node prev = head;


        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        newNode.next = prev.next;
        prev.next = newNode;
        newNode.prev = prev;
        size++;

    }

    public void display() {

        Node node = head;
        Node tail = null;

        while (node != null) {
            System.out.print(node.data + "-> ");
            tail = node;
            node = node.next;
        }
        System.out.println("END");

        // print reverse order...
        while (tail != null) {
            System.out.print(tail.data + " -> ");
            tail = tail.prev;
        }
        System.out.println("END");
    }


    class Node {

        Node prev;
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }


}
