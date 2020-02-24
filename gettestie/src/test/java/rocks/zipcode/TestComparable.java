package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;

public class TestComparable {


    @Test
    public void TestCompareTo() {
        ArrayList<Person> ppl = new ArrayList<>();
        ArrayList<Person> expected = new ArrayList<>();
        boolean check = false;

        ppl.add(new Person("Denny", 1992));
        ppl.add(new Person("Adam", 1993));
        ppl.add(new Person("Ban", 1993));
        ppl.add(new Person("Carred", 1994));

        expected.add(new Person("Adam", 1993));
        expected.add(new Person("Ban", 1993));
        expected.add(new Person("Carred", 1994));
        expected.add(new Person("Denny", 1992));

        for (int i = 0; i < ppl.size(); i++) {
            if (expected.size() > i) {
                if (expected.get(i).getName().equals(ppl.get(i).getName())) {
                    check = true;
                } else {
                    check = false;
                }
            } else {
                check = false;
                break;
            }
        }
        Assert.assertFalse(check);

        Collections.sort(ppl);
        for (int i = 0; i < ppl.size(); i++) {
            if (expected.get(i).getName().equals(ppl.get(i).getName())) {
                check = true;
            } else {
                check = false;
            }
        }
        Assert.assertTrue(check);
    }
}
