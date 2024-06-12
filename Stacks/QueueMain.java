package Stacks;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);

        queue.insert(5);
        queue.insert(76);
        queue.insert(23);
        queue.insert(56);
        queue.insert(34);

        queue.display();

        queue.remove();
        queue.display();
    }
}
