package com.github.zipcodewilmington;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMap {


    SinglyLinkedList[] array = new SinglyLinkedList[26];
    public DashaMap() {
        for (int i = 0; i < array.length; i++) {
            SinglyLinkedList list = new SinglyLinkedList();
            array[i] = list;
        }
    }


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


    public void set(String key, int value) {

        int pos = charToIndex(HashFunctionOne(key));
//        if(array[pos].contains(key)) {
//            this.delete(key);
//        }

        array[pos].add(key,value);


    }

    public void delete(String key) { //return string?
        int pos = charToIndex(HashFunctionOne(key));
        int listPos = array[pos].getPosition(key);
        array[pos].remove(listPos);
//        if(this.bucketSize(key) == 0){
//            array[pos] = null;
//        }
    }


    public int get(String key) {
        int pos = charToIndex(HashFunctionOne(key));
        int listPos = array[pos].getPosition(key);
        return array[pos].getNodeData(listPos);
    }


    public boolean isEmpty() {
        return size() == 0;
    }


    public long size() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].head != null) {
              count++;
            }
        }
        return count;
    }

    public int bucketSize(String key) {
        int pos = charToIndex(HashFunctionOne(key));
        if (array[pos] == null) {
            return 0;
        }
        return array[pos].getLength();
    }

    public void readFromFile() throws FileNotFoundException {
        try (BufferedReader br = new BufferedReader(new FileReader("word-list.txt"))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\s+");
                String key = parts[0];
                int value = Integer.parseInt(parts[1]);
                this.set(key, value);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
