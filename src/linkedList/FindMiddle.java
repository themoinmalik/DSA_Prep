package src.linkedList;

public class FindMiddle {

    public static void main(String[] args) {

        Node head = new Node();
        List list = new List();
        list.insertDataLast(10);
        list.insertDataLast(20);
        Node ans = middle(head);
        list.display(ans);

    }

    public static Node middle(Node head){

        Node slow = head;
        Node fast = head;

        while (fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
