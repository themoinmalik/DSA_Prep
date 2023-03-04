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
        size = size + 1;
    }

    public void insertLast(int data) {
        Node node = new Node(data);

        // check if  list is empty
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    public void reverseList() {

        Node currentNode = head;
        Node prevNode = null;

        while (currentNode != null) {

            Node next = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = next;

        }

        head = prevNode;

    }


    public void insert(int data, int index) {

        if (index > size) {
            System.out.println("The size of the list is " + size);
        }
        Node prev = head;
        for (int i = 0; i < index-1; i++) {
            prev = prev.next;
        }
        Node newNode = new Node(data);
        newNode.next = prev.next;
        prev.next = newNode;
        size++;
    }

    public int deleteFirst() {
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public int deleteLast() {
        int data = tail.data;
        Node prevNode = head;
        for (int i = 0; i < size - 2; i++) {
            prevNode = prevNode.next;
        }
        tail = prevNode;
        tail.next = null;
        size--;
        return data;
    }

    public int delete(int index) {

        Node prevNode = head;

        for (int i =0; i<index-1;i++) {
            prevNode = prevNode.next;
        }
        prevNode.next = prevNode.next.next;
        int data = prevNode.next.data;
        size--;
        return data;
    }


    public void reverseLL() {

        Node node = head;
        Node prev = null;

        while (node != null) {

            Node next = node.next;
            node.next = prev;
            prev = node;
            node = next;

        }
        head = prev;
    }


    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("END \n");
    }

    private class Node {

        int data;
        Node next;
        Node prev = null;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
