package ex04_ATBX_JAVA_operators;

public class Lab019_Typecasting {
    public static void main(String[] args) {
        // Widening=
        byte b = 10;
        int a = b;  // Implicit casting
        int a1 = (int)b; //Explicit --> Optional
        System.out.println(a);

        //Narrowing=

        int val = 300;
        byte b1 = (byte)val;
        System.out.println(val);
        System.out.println(b1);
    }
}
