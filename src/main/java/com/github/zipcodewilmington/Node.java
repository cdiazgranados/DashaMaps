package com.github.zipcodewilmington;

public class Node{
    //public class Node<E extends Comparable <E>> implements Comparable<Node<E>> {
    int data;

    String key;
    Node next;

    Node(String key, int data) {
        this.key = key;
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node node) {
        next = node;
    }

    public void setData(int data) {
        this.data = data;
    }
}

