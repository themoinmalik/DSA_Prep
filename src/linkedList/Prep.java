package src.linkedList;


public class Prep {

    public static void main(String[] args) {

        List list = new List();
        list.insertDataLast(12);
        list.insertDataLast(10);
        list.insertDataLast(20);
        list.display(list.head);
        list.insertFirst(30);
        list.display(list.head);
        list.delete(2);
        list.display(list.head);
        // Node head = list.reverseList(list.head);
        System.out.println("reversed");
        // list.display(head);
        // int num = list.midNode(head);
        // System.out.println(num);
        boolean ans = list.findNode(20);
        System.out.println(ans);
        int ans1 = list.lenNodeRec(list.head);
        System.out.println(ans1);

        
    }

}

class List {

    Node head;
    Node tail;
    int size;

    public List() {
    }

    public List(int size) {
        this.size = size;
    }

    public void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertDataLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size = size + 1;
    }

    public void insertFirst(int data) {

        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
        size = size + 1;

    }

    public void delete(int index) {

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;

    }

    public Node reverseList(Node head) {

        Node curr = head;
        Node prev = null;
        Node temp = null;

        while (curr != null) {

            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;

        }
       return prev;
    }

    // fuind mid node. 

    public int midNode(Node head) {

        // Node mid = null;
        Node temp = head;
        int len = 0;
        while(temp!=null){
            len = len+1;
            
        }
        Node midNode = head;

        for(int i = 0; i < len/2; i++){            
            midNode = midNode.next;            
        }

        return midNode.data;

    }

    // fidn the data in linekd list. 
    public boolean findNode(int data) {

        Node temp = head;
        while(temp!=null){
            
            if(temp.data==data){
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    // find lenght.... 
    public int lenNode(Node head){

        Node temp = head;
        int len = 0;
        while(temp!=null){
            len = len+1;
            temp = temp.next;
        }

        return len;
        
    }

    // recursively.... 
    public int lenNodeRec(Node head) {

        if (head== null) {
            return 0;
        }

        return  1+ lenNodeRec(head.next);
        
    }

}

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}