package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestArrayList {

    private static ArrayList<String> strings;

    @Before
    public void setup() {
        strings.clear();
    }

    @Test
    public void TestRetainAll() {
        strings.add("Adam");
        strings.add("Bennett");
        strings.add("Is cool");
        strings.add("Is lame");

        ArrayList<String> expected = new ArrayList<>();
        expected.add("Adam");
        expected.add("Bennett");
        expected.add("Is lame");

        strings.retainAll(expected);
        Assert.assertEquals(expected, strings);
    }

    @Test
    public void TestContains() {
        strings.add("Adam");
        Assert.assertTrue(strings.contains("Adam"));
        Assert.assertFalse(strings.contains("Not Adam"));
    }

    @Test
    public void TestRemoveObject() {
        String adam = "Adam";
        strings.add(adam);
        strings.remove(adam);
        Assert.assertFalse(strings.contains("Adam"));
    }

    @Test
    public void TestRemoveIndex() {
        String adam = "Adam";
        strings.add(adam);
        strings.remove(0);
        Assert.assertFalse(strings.contains("Adam"));
    }

    @Test
    public void TestGet() {
        strings.add("Adam");
        Assert.assertTrue(strings.get(0).equals("Adam"));
    }

    @Test
    public void TestSize() {
        strings.add("Adam");
        Assert.assertTrue(strings.size() == 1);
    }

    static {
        strings = new ArrayList<>();
    }

}
