package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class TestLinkedList {

    private static LinkedList<Integer> testList;

    @Test
    public void TestAdd() {
        testList.add(0, 26);
        testList.add(1, 33);
        testList.add(2, 48);
        Assert.assertTrue(testList.get(1) == 33);
    }

    @Test
    public void TestAddFirst() {
        testList.add(0, 26);
        testList.add(1, 33);
        testList.add(2, 48);
        testList.addFirst(50);
        Assert.assertTrue(testList.get(0) == 50);
    }

    @Test
    public void TestAddLast() {
        testList.add(0, 26);
        testList.add(1, 33);
        testList.add(2, 48);
        testList.addLast(50);
        Assert.assertTrue(testList.get(3) == 50);
    }

    @Test
    public void TestGetFirst() {
        testList.add(0, 26);
        testList.add(1, 33);
        testList.add(2, 48);
        testList.addFirst(50);
        Assert.assertTrue(testList.getFirst() == 50);
    }

    @Test
    public void TestGetLast() {
        testList.add(0, 26);
        testList.add(1, 33);
        testList.add(2, 48);
        testList.addLast(50);
        Assert.assertTrue(testList.getLast() == 50);
    }

    @Test
    public void TestPeek() {
        testList.add(0, 26);
        testList.add(1, 33);
        testList.add(2, 48);
        testList.addFirst(50);
        Assert.assertTrue(testList.peek() == 50);
    }

    @Test
    public void TestPop() {
        testList.clear();
        testList.add(0, 26);
        testList.add(1, 33);
        testList.add(2, 48);
        testList.addFirst(50);
        Assert.assertTrue(testList.pop() == 50);
        Assert.assertTrue(testList.pop() == 26);
        Assert.assertTrue(testList.size() == 2);
    }

    static {
        testList = new LinkedList<>();
    }

}
