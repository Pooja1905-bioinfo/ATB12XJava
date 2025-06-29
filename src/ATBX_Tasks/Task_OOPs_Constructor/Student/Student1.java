package ATBX_Tasks.Task_OOPs_Constructor.Student;

public class Student1 {
    String name;
    Integer age;
   // String Phn_no;


    public void display(){
        System.out.println("Details of Student");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        //System.out.println("Phone: " + Phn_no);
    }

    public Student1(String name, Integer age) {
        this.name = name;
        this.age = age;
        //Phn_no = phn_no;
    }

}
