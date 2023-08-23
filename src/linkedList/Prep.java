package src.linkedList;

public class Prep {
   
    public static void main(String[] args) {

        List list = new List();
        list.insertData(12);
        list.insertData(10);
        list.insertData(20);
        list.display();
         list.insertFirst(30);
         list.display();
         
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


    public void display() {

        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertDataLast(int data) {

       Node newNode = new Node(data);

       if (head == null) {
        head = newNode;        
       }else{
        tail.next = newNode; 
       }
       tail = newNode;
       size = size+1; 
    }

    public void insertFirst(int data) {

        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
        size = size+1;
        
    }

    
    
}


class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
    
}