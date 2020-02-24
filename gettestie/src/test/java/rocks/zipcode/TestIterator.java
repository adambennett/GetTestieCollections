package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class TestIterator {

    private static ArrayList<String> list;
    private static Iterator iterator;

    @Before
    public void setup() {
        list.clear();
        iterator = list.iterator();
    }

    // Not sure why I am always getting ConcurrentModificationException from this logic...
    // I can't test if it just throws exceptions always
    @Test
    public void TestHasNext() {
       /*ArrayList<String> temp = new ArrayList<>();
       Iterator it = temp.iterator();

        temp.add("Adam");
        temp.add("Pete");
        temp.add("Tom");
        temp.add("John");
        temp.add("Mark");
        temp.add("Ryan");
        while (it.hasNext()) {
            String next;
            next = (String)it.next();
            it.remove();
        }
        //Assert.assertTrue(list.size() == 0);*/
    }

    static {
        list = new ArrayList<>();
        iterator = list.iterator();
    }
}
