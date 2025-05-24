package ex06_ATBX_JAVA_In_Dec_Operator;

public class Lab004_In_De_Op {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++  + ++a); // a++ printed as 10 but stored as 11, then ==a happened to a which will add +1 to 11 a will be 12
        // but  a++ will be 10 and ++a will be 12 then addtion of line 6 will be 22
        System.out.println(a);

        //ln no | a | b
        //5  | 10 | na
        //6  | 11 | 12 = 21
        //7  | 11 | na
    }
}
