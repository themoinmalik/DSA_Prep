package src.linkedList;

public class Main {

    public static void main(String[] args) {

        LL list = new LL();

        list.insertFirst(10);
        list.insertFirst(23);
        list.insertFirst(78);
        list.insertLast(20);
        list.insert(34, 3);
        list.display();
//        list.deleteFirst();
//        list.display();
//        list.delete(1);
//        list.display();

//        list.reverseLL();
        list.reverseList();
        list.display();


//        DoubleLL dlist = new DoubleLL();
//
//        dlist.insertFirst(10);
//        dlist.insertFirst(20);
//        dlist.insertLast(30);
//        dlist.insertLast(90);
//        dlist.insert(50,3);
//        dlist.display();
//        dlist.deleteFirst(90);  // first node
//        dlist.display();
//

//        CLL cll = new CLL();
//
//        cll.insertFirstLast(10);
//        cll.insertFirstLast(40);
//        cll.insertFirstLast(30);
//        cll.insertFirstLast(20);
//        cll.display();
//        cll.delete(20);
//        cll.display();

        LL l2 = new LL();

        l2.insertFirst(10);
        l2.insertFirst(23);
        l2.insertFirst(78);
        l2.insertLast(20);
        l2.insert(34, 3);

        AddTwoLL addTwoLL = new AddTwoLL();

    }
}
