package ex24_Wrapper_Class;

public class Lab202_Wrapper_class {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a; //Boxing
        System.out.println(b.intValue());

        //Unboxing

        Integer aa =43;
        int bb = aa;
        System.out.println(bb);
    }
}
