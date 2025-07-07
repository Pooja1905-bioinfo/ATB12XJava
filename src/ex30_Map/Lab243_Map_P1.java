package ex30_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab243_Map_P1 {
    public static void main(String[] args) {
        Map<String, Object> m1 = new HashMap();
        //Key is the generic in the nature
        m1.put("Name", "Pooja");
        m1.put("MothersName", "Rajani");
        m1.put("Fathers_name", "Sanjay");
        System.out.println(m1);

        //no order maintained because of hashmap
        //Linked Hashmap= order maitain
        //Treehash map= sorted

        Map<String, Object> m2 = new LinkedHashMap();
        m2.put("Name", "Pooja");
        m2.put("MothersName", "Rajani");
        m2.put("Fathers_name", "Sanjay");


        Map<String, Object> m3 = new TreeMap<>();
        m3.put("Name", "Pooja");
        m3.put("MothersName", "Rajani");
        m3.put("Fathers_name", "Sanjay");


        System.out.println(m2);
        System.out.println(m3);
    }
}
