package src.linkedList;

public class ReversedLL2 {

    public static void main(String[] args) {

//        Node ans =

    }

    public static Node reversedLL2(Node head, int right, int left){
        Node prev = head;

        for (int i = 0;i<left-1;i++){
            prev = prev.next;
        }

        Node curr = prev.next;

        for (int i = 0; i<right-left;i++){
            Node temp = prev.next;
            prev.next = curr.next;
            curr.next = curr.next.next;
            prev.next.next = temp;
        }

        return prev.next;

    }
}
