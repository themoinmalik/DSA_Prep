package src.linkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

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

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("END");
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

    public void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = null;
    }

}
