package com.github.zipcodewilmington;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMap {
    public DashaMap() {}

    SinglyLinkedList[] array = new SinglyLinkedList[26];

    int charToIndex(char ch) {
        return (ch - 'a');
    }

    private char HashFunctionOne(String input) {
        input = input.toLowerCase();
        if (input.length() > 0) {
            return input.charAt(0);
        }

        return 0;
    }


    public void set(String key, String value) {
        SinglyLinkedList list = new SinglyLinkedList();
        int pos = charToIndex(HashFunctionOne(value));
//        array[pos] = list.add();
    }

//    public String delete(String key) {
//        return null;
//    }
//
//
//    public String get(String key) {
//        return null;
//    }
//
//
//    public boolean isEmpty() {
//        return false;
//    }
//
//
//    public long size() {
//        return 0;
//    }
//
//
//    public boolean bucketSize(String key) {
//        return false;
//    }
}
