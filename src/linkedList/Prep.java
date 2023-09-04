package src.linkedList;

public class Prep {

    public static void main(String[] args) {

        List list = new List();

        List list1 = new List();
        List list2 = new List();
        list1.insertDataLast(1);
        list1.insertDataLast(2);
        list1.insertDataLast(3);
        list1.insertDataLast(4);
        list2.insertDataLast(1);
        list2.insertDataLast(4);
        list2.insertDataLast(6);
        // list.display(list.head);
        // list.insertFirst(30);
        // list.display(list.head);
        // list.delete(2);
        // list.display(list.head);
        // Node head = list.reverseList(list.head);
        System.out.println("reversed");
        // list.display(head);
        System.out.println("mid node...");
        // int num = list.midNode(list.head);
        // System.out.println(num);
        // boolean ans = list.findNode(20);
        // System.out.println(ans);
        // int ans1 = list.lenNodeRec(list.head);
        // System.out.println(ans1);
        // remove elment....
        System.out.println("remove.... ");
        // Node node = list.removeElement(list.head, 6);
        // list.display(node);
        // duiplicates... 
        // Node ans1 = list.removeDuplicates(list.head);
        // list.display(ans1);

        Node ans = list.mergeNode(list1, list2);
        list.display(ans);
        //

        // happy
        int ans1 = list.sumSqr(19);
        System.out.println("ans-> " + ans1);

        // happy calling...
        boolean ans2 = list.happyNum(19);
        System.out.println("ans 2-> " + ans2);


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

    // using recursion...
    public Node insertLastRec(int data, Node head) {

        Node newNode = new Node(data);
        Node temp = head;

        if (temp.next == null) {

        }

        return head;

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

    // find mid node.
    public Node midNode(Node head) {

        // Node mid = null;
        Node fast_ptr = head;
        Node slow_ptr = head;

        while (fast_ptr != null && fast_ptr.next != null) {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
        }
        slow_ptr.next = null;
        return slow_ptr;

    }

    // fidn the data in linekd list.
    public boolean findNode(int data) {

        Node temp = head;
        while (temp != null) {

            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    // find lenght....
    public int lenNode(Node head) {

        Node temp = head;
        int len = 0;
        while (temp != null) {
            len = len + 1;
            temp = temp.next;
        }
        return len;
    }

    // recursively....
    public int lenNodeRec(Node head) {

        if (head == null) {
            return 0;
        }
        return 1 + lenNodeRec(head.next);

    }

    // remove element in LL .
    public Node removeElement(Node head, int x) {

        while (head != null) {
            if (head.data == x) {
                head = head.next.next;
            } else {
                head = head.next;
            }
        }
        return head;
    }

    // cycle exist ...
    public boolean cycleDetect(Node head) {

        Node slow, fast;
        slow = fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;

    }

    // remove duplicates ....
    public Node removeDuplicates(Node head) {

        Node t = head;
        while (t!=null && t.next != null) {
            if (t.data != t.next.data) {
                t = t.next;
            }else{
                t.next = t.next.next;
            }
        }
        return head;
    }

    // merge two sorted linked list... 
    public Node mergeNode(List l1, List l2){

        Node  f = l1.head;
        Node s = l2.head;

        List list = new List();

        while(f != null && s != null){

            if (f.data < s.data) {
                     list.insertDataLast(f.data);
                     f = f.next;           
            }else{
                list.insertDataLast(s.data);
                s = s.next;
            }

        }

        while (f != null) {
            list.insertDataLast(f.data);
            f = f.next;
        }
        while(s != null) {
            list.insertDataLast(s.data);
            s = s.next;
        }

        return list.head;

    }

    public int cycleLen(Node head){

        Node s,f;
        s = f = head;
        int count = 0;

        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
            if (s.data == f.data) {
                // calculate length of a cycle,....
                Node temp = s;
                do{
                s= s.next;
                count = count+1;
                }while(s!=temp);
            }
            
        }
        return 0;

    }


    // LL ||. 
    public Node findStartCycle(Node head){

        Node slow,fast,entry;
        slow = fast = entry = head;

        while (fast!=null && fast.next!=null){

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                // same node.
                while (entry!=slow){
                    entry = entry.next;
                    slow = slow.next;
                }
                return entry;
            }

        }
        return  null;

    }



    // happy number
    public boolean happyNum(int n){

       int s = n;
       int f = n;

       do {
           s = sumSqr(s);
           f = sumSqr(sumSqr(f));
       }while (s!=f);

       if (s==1){
           return true;
       }
       return false;

    }

    public int sumSqr(int n){

        int rem = 0;
        int sum = 0;

        while (n>0){
            rem = n%10;
            sum = sum + rem*rem;
            n = n/10;
        }
       return sum;
    }

    // sort linked list....
    public Node sortLL(Node head){

        Node s, f;
        s = f = head;
        Node temp = null;

        //find mid...
        while (f!=null && f.next !=null){
            temp = s;
            s = s.next;
            f = f.next.next;
        }
        temp.next = null;

        // merge
        Node left = sortLL(head);
        Node right = sortLL(s);

        //Start merging...
        Node dummyHead = new Node();
        Node tail = dummyHead;

        while (left!=null&&right!=null){
            if (left.data<right.data){
                tail.next = left;
                left = left.next;
            }else {
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }
        if (left!=null){
            tail.next = left;
            left = left.next;
        }
        if (right!=null){
            tail.next = right;
            right = right.next;
        }

        return dummyHead.next;

    }

}
