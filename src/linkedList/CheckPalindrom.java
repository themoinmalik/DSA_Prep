package src.linkedList;

public class CheckPalindrom {

    public static void main(String[] args) {

        Node head = new Node();
        Boolean ans  = isPalindrom(head);

    }

    public static boolean isPalindrom(Node head){

        // find middle of LL.
        Node slow = head;
        Node fast = slow;

        while (fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow.next;

        // reversed 2nd list..
        Node curr = mid;
        Node temp = null;
        Node prev = null;

        while (curr!=null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        Node newHalf = prev.next;
        // check palindrom...

        Node first = head;
        Node second = newHalf;

        while (first!=mid){
            if (first.data!=second.data){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }
}
