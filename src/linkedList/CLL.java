package src.linkedList;

public class CLL {


    Node head;
    Node tail;
    int size;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insertFirstLast(int data) {


        Node node = new Node(data);

        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }


    public void delete(int data) {

        Node node = head;

        while (node.data != data) {
            node = node.next;
            if (node.next.data == data ) {
                node.next = node.next.next;
                break;
            }
        }
        return;
    }

    public void display() {

        Node temp = head;


        if (temp != null) {
            do {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            } while (temp != head);
        }

        System.out.println("HEAD");
    }


    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

}
