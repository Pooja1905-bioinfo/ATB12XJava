package ex05_ATBX_JAVA_Operators_part_2_ternary;

public class Lab002_Three_Num_Max {
    public static void main(String[] args) {
        int n1 = 99;
        int n2 = 100;
        int n3 = 98;

        int result = (n1 > n2 && n1 > n3)? n1 : (n2 > n3)? n2 : n3;
        System.out.println(result);
    }
}
