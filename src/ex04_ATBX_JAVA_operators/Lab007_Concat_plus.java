package ex04_ATBX_JAVA_operators;

public class Lab007_Concat_plus {
    public static void main(String[] args) {
        String fn = "Pooja";
        String ln = " Gaydhani";
        int a = 6;
        int b = 30;
        System.out.println(a + b + fn + ln);
        System.out.println(fn + ln + a + b);  // it is joining the integers
        System.out.println(fn + ln + (a +b ));
    }
}
