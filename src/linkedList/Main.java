package src.linkedList;

public class Main {

    public static void main(String[] args) {

//        LL list = new LL();
//
//        list.insertFirst(10);
//        list.insertFirst(23);
//        list.insertFirst(78);
//        list.insertLast(20);
//        list.insert(34, 3);
//        list.display();
//        list.deleteFirst();
//        list.display();
//        list.delete(1);
//        list.display();


        DoubleLL dlist = new DoubleLL();

        dlist.insertFirst(10);
        dlist.insertFirst(20);
        dlist.display();
        dlist.insertLast(30);
        dlist.insertLast(90);
        dlist.display();
        dlist.insert(50,3);
        dlist.display();

    }
}
