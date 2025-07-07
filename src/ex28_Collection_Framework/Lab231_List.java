package ex28_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab231_List {
    public static void main(String[] args) {
        List fruits = List.of("Orange","Guava","Apple","Mango");
        System.out.println(fruits);

        List arrayList = new ArrayList<>();
        arrayList.add("Pooja");
        arrayList.add("Gaydhani");
        arrayList.add(123);
        arrayList.add(true);
        arrayList.add(12.8);
        System.out.println(arrayList);
        System.out.println(arrayList.size());

    }
}
