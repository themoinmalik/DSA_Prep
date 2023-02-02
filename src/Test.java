package src;

import java.lang.*;


class Test {

    Node head;    // null.  default.
    Node tail;   // null default...
    int size;

    public Test() {
        this.head = null;
        this.tail = null;
    }

    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void insertFirst(int data) {

        if (head == null) {
            tail = null;
        }

        Node node = new Node(data);
        node.next = head;
        head = node;
        tail = node;
        size++;

    }

    public void insertAfterNode(int data1, int data2) {

        Node node = head;
        while (node.data != data1) {
            node = node.next;
        }
        Node newNode = new Node(data2);
        newNode.next = node.next;
        node.next = newNode;
        size++;

    }

    public Boolean searchElement(int data) {

        Node node = head;
        while (node != null) {
            if (node.data == data) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public void sizeLL() {

        int count = 0;

        Node node = head;
        while ( node != null) {
            count++;
            node = node.next;
        }
        System.out.println(count);

    }

    public void reverseLL() {

        Node node = head;
        Node prev = null;
        Node next = null;
        while (node != null) {
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        head = prev;

    }

    public void display() {

        Node node = head;

        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println("END");
    }


}


class Main {

    public static void main(String[] args) {

        Test test = new Test();

        test.insertFirst(10);
        test.insertFirst(20);
        test.insertFirst(30);
        test.display();
        test.insertAfterNode(20, 50);
        test.display();
        boolean ans1 = test.searchElement(10);
        System.out.println(ans1);
        boolean ans  = test.searchElement(90);
        System.out.println(ans);
        test.sizeLL();
        test.reverseLL();
        test.display();


    }
}