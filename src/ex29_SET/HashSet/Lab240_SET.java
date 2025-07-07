package ex29_SET.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab240_SET {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add(1);
        hs.add(2);
        hs.add(5);
        hs.add(4);
        System.out.println(hs);
    }
}
