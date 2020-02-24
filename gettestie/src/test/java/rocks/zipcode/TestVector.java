package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Vector;

public class TestVector {

    private static Vector<Integer> vectoid;

    @Before
    public void setup() {
        vectoid = new Vector<>();
    }

    @Test
    public void TestAdd() {
        vectoid.add(26);
        Assert.assertTrue(vectoid.get(0) == 26);
    }

    @Test
    public void TestCopyInto() {
        vectoid.add(25);
        vectoid.add(30);
        vectoid.add(50);
        Integer[] actual = new Integer[3];
        vectoid.copyInto(actual);
        Integer[] expected = new Integer[] { 25, 30, 50};
        Assert.assertTrue(Arrays.deepEquals(expected, actual));
    }

    @Test
    public void TestRemoveIndex() {
        vectoid.add(25);
        vectoid.add(30);
        vectoid.add(50);
        vectoid.remove(0);
        Vector<Integer> expected = new Vector<>();
        expected.add(30);
        expected.add(50);
        Assert.assertEquals(expected, vectoid);
    }

    @Test
    public void TestRemoveObject() {
        vectoid.add(25);
        vectoid.add(30);
        vectoid.add(50);
        vectoid.remove(new Integer(50));
        Vector<Integer> expected = new Vector<>();
        expected.add(25);
        expected.add(30);
        Assert.assertEquals(expected, vectoid);
    }

    static {
        vectoid = new Vector<>();
    }
}
