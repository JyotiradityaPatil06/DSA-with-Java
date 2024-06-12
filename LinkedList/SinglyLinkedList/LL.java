package LinkedList.SinglyLinkedList;

import Recursion.nto1;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    // HEAD INSERTION
    public void insertFirst(int val) {
        Node node = new Node(val); // A new 'Node' object is created with the given value 'val'
        node.next = head; // 'next' reference of this new node is set to the current 'head'
        head = node; // haed is updated to this new node

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    // TAIL INSERTION
    public void insertLast(int val) {

        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // NODE INSERTION AT GIVEN INDEX
    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

    }

    // INSERTION USING RECURSION
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {

        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, --index, node.next);
        return node;
    }

    // DELETING HEAD
    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    // DELETING TAIL
    public int deleteLast() {
        if (size <= 1) {
            deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    // DELETING A NODE
    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }

    // REVERSING THE NODE
    public Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        node = prev;
        return node;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // Reversing the linked List Recursively
    private void reverseRec(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }

        reverseRec(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // PRINTING A NODE
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next; // next: This is a property of the Node class, which holds a reference to the
                           // next node in the linked list.

        // initializes a node with a value and sets the 'next' reference to null.
        public Node(int value) {
            this.value = value;
        }

        // Initializes a node with a value and sets the next reference to point to
        // another node.
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
