package LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();

        list.insertFirst(3);
        list.insertFirst(1);
        list.insertFirst(7);
        list.insertFirst(4);
        list.insertFirst(8);
        list.insertLast(99);
        list.insert(8, 78);
        list.display();

    }
}
