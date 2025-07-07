package ex28_Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab234_List {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("bread");
        list.add("milk");
        list.add("butter");
        list.add("paneer");
        list.add("jam");
        list.add("Chhese");
        list.add(123);
        list.add(true);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("1"));

        for (Object o: list){
            System.out.println(o);
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
