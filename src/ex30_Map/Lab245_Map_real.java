package ex30_Map;

import java.util.HashMap;
import java.util.Map;

public class Lab245_Map_real {
    public static void main(String[] args) {
        Map<String, Object> student = new HashMap<>();
        student.put("Name", "Pooja");
        student.put("Phone", "76878543");
        student.put("Address", "Pune");
        student.put("Home_Address", "Nashik");
        System.out.println(student);

        Map<String, Object> student2 = new HashMap<>();
        student2.put("Name", "Poorva");
        student2.put("Phone", "86879543");
        student2.put("Address", "Pune");
        student2.put("Home_Address", "Dhule");
        System.out.println(student2);
    // different from the set as set contains only the Values
        //while map contains both key and Value

    }
}
