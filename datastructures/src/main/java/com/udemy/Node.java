package com.udemy;

public class Node {

    /*
     * The following is a field that holds the integer value of the node.
     * It's the payload or the main data stored in this node.
     */
    int value;

    /*
     * The following is a reference (or pointer) to another Node object.
     * If it’s null, it means the node does not point to another node (i.e., it’s
     * the last node in the chain).
     */
    Node next;

    /*
     * The following is a parameterized constructor, which initializes the value of a Node
     * instance when it is created.
     * The this.value keyword ensures that the value field of the object being
     * constructed is set to the value parameter passed to the constructor.
     * Behavior: When a Node object is created with new Node(5), its value field is
     * set to 5, and next is automatically null (default for object references).
     */
    Node(int value) {
        this.value = value;
    }

}
