package LinkedList;

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
    
    // FINDING THE NODE
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }

        return node;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
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
