package LinkedList.CircularLinkedList;

public class cllMain {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(23);
        list.insert(2);
        list.insert(20);
        list.insert(54);
        list.delete(20);
        list.display();
    }
}
