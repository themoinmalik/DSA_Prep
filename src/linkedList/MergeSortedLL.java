package src.linkedList;


class ListNode {

    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
    }
}


public class MergeSortedLL {


    public ListNode mergeSortedLL(ListNode l1, ListNode l2) {

        ListNode l3 = null;
        ListNode head = null;


        while (l1 != null || l2 != null) {

            int minVal;

            if (l1 == null) {
                minVal = l2.data;
                l2 = l2.next;
            }else if (l2 == null) {
                minVal = l1.data;
                l1 = l1.next;
            }else if (l1.data <= l2.data) {
                minVal = l1.data;
                l1 = l1.next;
            }else {
                minVal = l2.data;
                l2 = l2.next;
            }

            if (l3 == null) {
                l3 = head = new ListNode(minVal);
            } else {
                l3.next = new ListNode(minVal);
                l3 = l3.next;
            }

        }

        return  head;

    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        MergeSortedLL mergeSortedLL = new MergeSortedLL();
        ListNode result = mergeSortedLL.mergeSortedLL(l1,l2);

        while (result != null) {
            System.out.print(result.data + "->");
            result = result.next;
        }
        System.out.println("END");

    }

}
