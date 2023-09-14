package src;

import java.lang.*;
import java.util.HashMap;
import java.util.HashSet;


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

    public void deleteNode(int data) {

        Node node = head;

        while (node != null) {

            if (node.next.data == data) {
                node.next = node.next.next;
                break;
            }
            node = node.next;
        }
        size--;

    }

    public void nthNode(int index) {

        if (index >= size) {
            return;
        }

        Node node = head;

        for (int i =0;i<index;i++) {
            node = node.next;
        }
        System.out.println(node.data);

    }

    public void nthFromLast(int index) {

        int count = 0;

        Node node = head;
        while (node!=null) {
            count++;
            node = node.next;
        };
        Node node1 = head;

        for (int i =0;i<count-size+1;i++) {
            node1 = node1.next;
        }
        System.out.println(node1.data);

    }


    public void delDup() {

        Node node = head;
        HashSet<Integer> set = new HashSet<>();
        Node prev = null;

        while (node != null) {

            if (set.contains(node.data)) {
                node = node.next;
            } else {
                set.add(node.data);
                prev = node;
            }

            node = node.next;

        }
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
        test.nthNode(2);
        test.insertAfterNode(20, 50);
        test.display();
        boolean ans1 = test.searchElement(10);
        System.out.println(ans1);
        boolean ans  = test.searchElement(90);
        System.out.println(ans);
        test.sizeLL();
        test.sizeLL();
//        test.reverseLL();
        test.display();
        test.deleteNode(20);
        test.display();
        test.nthNode(3);
        test.nthFromLast(2);

    }
}