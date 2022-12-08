package com.github.zipcodewilmington;

public class SinglyLinkedList {

        Node head;

        private int length = 0;

        SinglyLinkedList() {
            this.head = null;
        }

        public void add(String key, int data) {
            Node temp = new Node(key, data);

            if (this.head == null) {
                head = temp;
            } else {
                Node X = head;

                while (X.next != null) {
                    X = X.next;
                }

                X.next = temp;
            }
            length++;
        }

        public int getPosition(int data) {
            Node temp = head;
            int pos = 0;
            while (temp != null) {
                if (temp.getData() == data) {
                    return pos;
                }
                pos++;
                temp = temp.getNext(); //needs to return next node!
            }
            return -1;
        }

        public void remove(int position) {
            if (position == 0) {
                head = head.getNext();
            } else {
                Node temp = head;
                for (int i = 1; i < position; i++) {
                    temp = temp.getNext();
                }
                temp.setNext(temp.getNext().getNext());
            }
            length--;
        }

        public int getLength() {
            return length;
        }

        public boolean contains(int data) {
            Node temp = head;
            while (temp != null) {
                if (temp.getData() == data) {
                    return true;
                }
                temp = temp.getNext();
            }
            return false;
        }

        public int getNodeData(int position) {
            Node temp = head;
            for (int i = 0; i < position; i++) {
                temp = temp.getNext();
            }
            return temp.getData();
        }

        public void setNodeData(int position, int data) {
            Node temp = head;
            for (int i = 0; i < position; i++) {
                temp = temp.getNext();
            }
            temp.setData(data);
        }

    }

