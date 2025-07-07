package ex29_SET.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab241_All_Sets {
    public static void main(String[] args) {
        Set<String> hs = new HashSet();
        hs.add("Apple");
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add(null);
        System.out.println("HashSet");
        System.out.println(hs);
        System.out.println("____________________________________________________");


        Set lhs = new LinkedHashSet();
        lhs.add("Apple");
        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("Watermelon");
        lhs.add("Guava");
        System.out.println("Linked HashSet");
        System.out.println(lhs);
        System.out.println("______________________________________________________");


        Set ts = new TreeSet<>();
        ts.add("apple");
        ts.add("Dapple");
        ts.add("Watermelon");
        ts.add("Orange");
        System.out.println("TreeSet");

        System.out.println(ts);
        System.out.println(ts.size());
        System.out.println(ts.contains("Apple"));
        System.out.println(ts.isEmpty());

    }
}
