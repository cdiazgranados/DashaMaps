package com.github.zipcodewilmington;

public class Node{
    //public class Node<E extends Comparable <E>> implements Comparable<Node<E>> {
    int value;



    String key;
    Node next;

    Node(String key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node node) {
        next = node;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}

