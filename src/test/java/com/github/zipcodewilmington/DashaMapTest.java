package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMapTest {
    @Test
    public void arraySetAnsSize_test() {
        DashaMap dm = new DashaMap();
        dm.set("apple", 7);
        int expected = 1;
        int actual = (int) dm.size();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void arraySetAndSize_test2() {
        DashaMap dm = new DashaMap();
        dm.set("apple", 7);
        dm.set("car", 16);
        int expected = 2;
        int actual = (int) dm.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void arraySet_test_singlyLinked() {
        DashaMap dm = new DashaMap();
        dm.set("apple", 7);
        dm.set("car", 16);
        dm.set("cartoon", 5);
        int expected = 2;
        int actual = (int) dm.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void arrayDelete_test2() {
        DashaMap dm = new DashaMap();
        dm.set("apple", 7);
        dm.set("car", 16);
        dm.set("cartoon", 5);
        dm.delete("apple");
        int expected = 1;
        long actual = dm.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsEmpty() {
        DashaMap dm = new DashaMap();
        boolean actual = dm.isEmpty();
        Assert.assertTrue(actual);
    }

    @Test
    public void testIsEmpty_False() {
        DashaMap dm = new DashaMap();
        dm.set("apple", 7);
        boolean actual = dm.isEmpty();
        Assert.assertFalse(actual);
    }

    @Test
    public void testIsEmpty_TrueAfterDelete() {
        DashaMap dm = new DashaMap();
        dm.set("apple", 7);
        dm.delete("apple");
        boolean actual = dm.isEmpty();
        Assert.assertTrue(actual);
    }

    @Test
    public void testBucket() {
        DashaMap dm = new DashaMap();
        dm.set("apple", 7);
        int expected = 1;
        int actual = dm.bucketSize("apple");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBucket2() {
        DashaMap dm = new DashaMap();
        dm.set("animal", 1);
        dm.set("apple", 7);
        dm.set("acorn", 5);
        int expected = 3;
        int actual = dm.bucketSize("acorn");

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGet() {
        DashaMap dm = new DashaMap();
        dm.set("animal", 1);
        dm.set("apple", 7);
        dm.set("acorn", 5);
        int expected = 5;
        int actual = dm.get("acorn");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReadFromFile() throws FileNotFoundException {
        DashaMap dm = new DashaMap();
        dm.readFromFile();

        int expected = 2;
        int actual = dm.get("any");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReadFromFile_get() throws FileNotFoundException {
        DashaMap dm = new DashaMap();
        dm.readFromFile();

        int expected = 88;
        int actual = dm.get("having");

        Assert.assertEquals(expected, actual);
    }


}
