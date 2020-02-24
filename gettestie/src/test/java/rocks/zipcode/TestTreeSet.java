package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.reflect.generics.tree.Tree;

import java.util.TreeSet;

public class TestTreeSet {

    private static TreeSet<Integer> treehouse;

    @Before
    public void setup() {
        treehouse.clear();
    }

    @Test
    public void TestContains() {
        treehouse.add(26);
        Assert.assertTrue(treehouse.contains(26));
        Assert.assertFalse(treehouse.contains(2222));
    }

    @Test
    public void TestRemove() {
        treehouse.add(26);
        Assert.assertTrue(treehouse.contains(26));
        treehouse.remove(26);
        Assert.assertFalse(treehouse.contains(26));
    }

    @Test
    public void TestSize() {
        treehouse.add(26);
        treehouse.add(33);
        treehouse.add(38);
        treehouse.add(38);
        treehouse.add(38);
        treehouse.add(38);
        treehouse.add(38);
        treehouse.add(38);
        treehouse.add(38);
        treehouse.add(38);
        Assert.assertTrue(treehouse.size() == 3);
    }


    static {
        treehouse = new TreeSet<>();
    }

}
