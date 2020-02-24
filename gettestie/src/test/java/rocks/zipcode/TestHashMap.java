package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    private static HashMap<String, Integer> testMap;

    @Before
    public void setup() {
        testMap.clear();
    }

    @Test
    public void TestContainsKey() {
        testMap.put("Adam", 26);
        Assert.assertTrue(testMap.containsKey("Adam"));
    }

    @Test
    public void TestContainsValue() {
        testMap.put("Adam", 26);
        Assert.assertTrue(testMap.containsValue(26));
    }

    @Test
    public void TestEntrySet() {
        testMap.put("Adam", 26);
        testMap.put("Pete", 25);
        testMap.put("John", 30);
        testMap.put("Skinny Rick", 81);
        int actual = 0;
        int expected = 4;
        for (Map.Entry<String, Integer> i : testMap.entrySet()) {
            actual++;
        }
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestGet() {
        testMap.put("Adam", 26);
        Assert.assertTrue(testMap.get("Adam") == 26);
    }

    static {
        testMap = new HashMap<>();
    }


}
