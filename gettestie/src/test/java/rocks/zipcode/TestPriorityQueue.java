package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.PriorityQueue;

public class TestPriorityQueue {

    private static PriorityQueue<Integer> testQ;

    @Before
    public void setup() {
        testQ = new PriorityQueue<>();
    }

    @Test
    public void TestAdd() {
        testQ.add(26);
        Assert.assertTrue(testQ.contains(26));
    }

    @Test
    public void TestPoll() {
        testQ.add(25);
        testQ.add(10);
        Assert.assertTrue(testQ.poll() == 10);
        Assert.assertTrue(testQ.size() == 1);
    }

    @Test
    public void TestPeek() {
        testQ.add(25);
        testQ.add(10);
        Assert.assertTrue(testQ.peek() == 10);
        Assert.assertTrue(testQ.size() == 2);
    }


    static {
        testQ = new PriorityQueue<>();
    }
}
