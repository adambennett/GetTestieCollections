package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {

    private static TreeMap<String, Integer> treehouse;

    @Before
    public void setup() {
        treehouse.clear();
    }

    @Test
    public void TestContainsKey() {
        treehouse.put("Adam", 26);
        Assert.assertTrue(treehouse.containsKey("Adam"));
    }

    @Test
    public void TestContainsValue() {
        treehouse.put("Adam", 26);
        Assert.assertTrue(treehouse.containsValue(26));
    }

    @Test
    public void TestEntrySet() {
        treehouse.put("Adam", 26);
        treehouse.put("Pete", 25);
        treehouse.put("John", 30);
        treehouse.put("Skinny Rick", 81);
        int actual = 0;
        int expected = 4;
        for (Map.Entry<String, Integer> i : treehouse.entrySet()) {
            actual++;
        }
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestDescendingSet() {
        treehouse.put("Adam", 26);
        treehouse.put("Pete", 25);
        treehouse.put("John", 30);
        treehouse.put("Skinny Rick", 81);
        String actual = "";
        String expected = "Skinny Rick";
        for (String i : treehouse.descendingKeySet()) {
            actual = i;
            break;
        }
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestGet() {
        treehouse.put("Adam", 26);
        Assert.assertTrue(treehouse.get("Adam") == 26);
    }

    static {
        treehouse = new TreeMap<>();
    }

}
