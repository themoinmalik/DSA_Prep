package src.linkedList;

public class Main {

    public static void main(String[] args) {

        LL list = new LL();

        list.insertFirst(10);
        list.insertLast(20);
        list.insertFirst(78);
        list.insert(34,3);
        list.display();
    }
}
