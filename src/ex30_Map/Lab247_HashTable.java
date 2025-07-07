package ex30_Map;

import java.util.Hashtable;

public class Lab247_HashTable {
    public static void main(String[] args) {
        // Key , value= no null values
        Hashtable<Integer, String> h1 = new Hashtable<>();
        h1.put(1,"pooja");
        //h1.put(1,null);
        System.out.println(h1);


    }
}
