package ex06_ATBX_JAVA_In_Dec_Operator;

public class Lab002_In_post {
    public static void main(String[] args) {
        int a = 10;
       // System.out.println(a);
        int b = a++;
        System.out.println(a);
        System.out.println(b); // pr

        // ERT
        // Line no | a | result of b
        // 5 | 10 | NA
        // 6 | 11 | 10
        // 7 | 11 | na
        // 8 | na | 10
    }
}
