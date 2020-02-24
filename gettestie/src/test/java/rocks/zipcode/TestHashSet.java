package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class TestHashSet {

    private static HashSet<Integer> testHash;

    @Test
    public void TestContains() {
        testHash.add(26);
        Assert.assertTrue(testHash.contains(26));
        Assert.assertFalse(testHash.contains(2222));
    }

    @Test
    public void TestRemove() {
        testHash.add(26);
        Assert.assertTrue(testHash.contains(26));
        testHash.remove(26);
        Assert.assertFalse(testHash.contains(26));
    }

    @Test
    public void TestSize() {
        testHash.add(26);
        testHash.add(33);
        testHash.add(38);
        testHash.add(38);
        testHash.add(38);
        testHash.add(38);
        testHash.add(38);
        testHash.add(38);
        testHash.add(38);
        testHash.add(38);
        Assert.assertTrue(testHash.size() == 3);
    }


    static {
        testHash = new HashSet<>();
    }

}
