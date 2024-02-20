package ru.antipov.Algorithms.seminar_3;

public class LinkedList<E> {

    private Node head;

    class Node {
        Node next;
        E value;
    }

    public void addFirst(E value) {
        Node node = new Node();
        node.value = value;
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public Node contains(E value) {
        Node node = head;
        while (node != null) {
            if (node.value.equals(value)) {
                return node;
            }
            node = node.next;
        }
        return null;
    }




}
