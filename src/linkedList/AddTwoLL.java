package src.linkedList;


class Node {
    int data;
    Node next;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class AddTwoLL {

    public Node addListData(Node l1, Node l2) {

        Node dummy = new Node();
        Node temp = dummy;


        while (l1 != null && l2 != null) {

            int sum = 0;
            int carry = 0;

            if (l1 != null) {
                sum = sum + l1.data;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum = sum + l2.data;
                l2 = l2.next;
            }

            sum = sum + carry;
            carry = sum / 10;
            Node l3 = new Node(sum % 10);
            temp.next = l3;
            temp = temp.next;


        }

        return dummy.next;


    }
}
