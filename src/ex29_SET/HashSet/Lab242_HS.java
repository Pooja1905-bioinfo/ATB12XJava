package ex29_SET.HashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab242_HS {
    public static void main(String[] args) {
        Set hs = new HashSet();
        hs.add(54);
        hs.add(76);
        hs.add(11);
        hs.add(10);

        System.out.println(hs);

        Set ts = new TreeSet();
        ts.add(54);
        ts.add(76);
        ts.add(11);
        ts.add(10);

        System.out.println(ts);
    }
}
