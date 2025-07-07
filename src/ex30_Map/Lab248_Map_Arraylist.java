package ex30_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab248_Map_Arraylist {
    public static void main(String[] args) {
        HashMap<String, String> student = new HashMap<>();
        student.put("Name", "Pooja");
        student.put("Phone", "76878543");
        student.put("Address", "Pune");
        student.put("Home_Address", "Nashik");
        System.out.println(student);

        HashMap<String, String> student2 = new HashMap<>();
        student2.put("Name", "Poorva");
        student2.put("Phone", "86879543");
        student2.put("Address", "Pune");
        student2.put("Home_Address", "Dhule");
        System.out.println(student2);

        List StudentsList = new ArrayList<>();
        StudentsList.add(student);
        StudentsList.add(student2);
        System.out.println(StudentsList);
    }
}
