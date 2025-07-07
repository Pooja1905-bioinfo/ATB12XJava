package ex28_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab235_NestedArrayLIst {
    public static void main(String[] args) {
        List<String> fruits1 = new ArrayList<>();
        fruits1.add("Orange");
        fruits1.add("Apple");
        fruits1.add("Cherry");
        fruits1.add("Guava");
        System.out.println(fruits1);

        List fruits2 =new ArrayList();
        fruits2.add("Mango");
        fruits2.add("Papaya");
        fruits2.add("Grapes");
        System.out.println(fruits2);

        List vegetables = new ArrayList();
        vegetables.add("Okra");
        vegetables.add("Tomato");
        vegetables.add("Onion");


        List all_fruits_veg = new ArrayList();
        all_fruits_veg.add(fruits1);
        all_fruits_veg.add(fruits2);
        all_fruits_veg.add(vegetables);

        System.out.println(all_fruits_veg);
        System.out.println(all_fruits_veg.size());
        System.out.println(all_fruits_veg.get(1));


    }
}
