package src.linkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
    }

    public LL(int size) {
        this.size = size;
    }

    public void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size = size+1;
    }

    public void insertLast(int data) {
        Node node = new Node(data);

        // check if  list is empty
        if (head == null) {
            head = node;
        }else {
            tail.next = node;
        }
        tail = node;
    }


    public void insert(int data, int index) {

        if (index > size) {
            System.out.println("The size of the list is " + size);;
        }

        Node prev = head;

        for (int i = 0;i<index-1;i++) {
            prev = prev.next;
        }
        Node newNode = new Node(data);
        newNode.next = prev.next;
        prev.next = newNode;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    private class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
