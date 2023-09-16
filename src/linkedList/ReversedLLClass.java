package src.linkedList;

public class ReversedLLClass {

    public static void main(String[] args) {

    }

    public static Node reversedLL(Node head){

        Node temp = null;
        Node curr = head;
        Node prev = null;

        while (curr!=null){

            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;

        }
        return prev;
    }
}
