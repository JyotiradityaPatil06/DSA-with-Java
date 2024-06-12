package LinkedList.SinglyLinkedList;

public class LLMain {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(8);
        list.insertFirst(6);
        list.insertFirst(5);
        list.insertFirst(17);
        list.display();

        list.insertLast(88);
        list.display();

        list.insert(100, 4);
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();

        list.delete(3);
        list.display();

        list.insertRec(88, 2);
        list.display();

        list.reverse(head);
    }
}
