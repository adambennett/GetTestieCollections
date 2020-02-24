package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;

public class TestArrayDeque {

    private static ArrayDeque<Integer> techDeck;

    @Before
    public void setup() {
        techDeck.clear();
    }

    @Test
    public void TestAddFirst() {
        techDeck.addFirst(26);
        techDeck.addFirst(25);
        Assert.assertTrue(techDeck.peekFirst().equals(25));
    }

    @Test
    public void TestAddLast() {
        techDeck.addLast(26);
        techDeck.addLast(25);
        Assert.assertTrue(techDeck.peekLast().equals(25));
    }

    @Test
    public void TestContains() {
        techDeck.add(25);
        Assert.assertTrue(techDeck.contains(25));
    }

    @Test
    public void TestPollFirst() {
        techDeck.addFirst(26);
        techDeck.addFirst(25);
        Assert.assertTrue(techDeck.size() == 2);
        Assert.assertTrue(techDeck.pollFirst().equals(25));
        Assert.assertTrue(techDeck.size() == 1);
    }

    @Test
    public void TestPollLast() {
        techDeck.addLast(26);
        techDeck.addLast(25);
        Assert.assertTrue(techDeck.size() == 2);
        Assert.assertTrue(techDeck.pollLast().equals(25));
        Assert.assertTrue(techDeck.size() == 1);
    }

    @Test
    public void TestPop() {
        techDeck.addFirst(26);
        techDeck.addFirst(25);
        Assert.assertTrue(techDeck.pop().equals(25));
    }

    @Test
    public void TestPush() {
        techDeck.push(25);
        techDeck.push(26);
        techDeck.push(33);
        Assert.assertTrue(techDeck.pop().equals(33));
    }

    @Test
    public void TestRemoveFirst() {
        techDeck.addFirst(25);
        techDeck.addFirst(26);
        Assert.assertTrue(techDeck.removeFirst() == 26);
        Assert.assertTrue(techDeck.size() == 1);
    }

    @Test
    public void TestRemoveLast() {
        techDeck.addLast(26);
        techDeck.addLast(25);
        Assert.assertTrue(techDeck.removeLast() == 25);
        Assert.assertTrue(techDeck.size() == 1);
    }

    static {
        techDeck = new ArrayDeque<>();
    }
}
