package ex22_Static;

public class Lab193_Static_P2 {
    public static void main(String[] args) {
        ATB Pooja = new ATB(72492598, "Pooja");
        ATB aishwarya = new ATB(94987298, "Aishwarya");
        System.out.println(Pooja.phone_np);
        System.out.println(aishwarya.name);
        System.out.println(Pooja.course_name);
        System.out.println(aishwarya.course_name);
        ATB.m1();
    }

}


class ATB{
    int phone_np;
    String name;
    static String course_name = "ATB";

    public ATB(int phone_np, String name) {
        this.phone_np = phone_np;
        this.name = name;
    }

    void display(){
        System.out.println(this.phone_np + this.name + course_name);

    }

    static void m1(){
        System.out.println("Mark Attendance");
    }
}
