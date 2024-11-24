package com.udemy;

public class LinkedList {
    private static Node head;
        private Node tail;
        private int length;
    
        // Create new node - Constructor
        public LinkedList(int value) {
            Node newNode = new Node(value);
            head = newNode;
            tail = newNode;
            length = 1;
        };
    
        public static void printList() {
            Node temp = head;
        while (head != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }

    }

}
