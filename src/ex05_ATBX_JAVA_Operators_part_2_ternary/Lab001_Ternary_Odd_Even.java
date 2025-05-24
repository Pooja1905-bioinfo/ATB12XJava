package ex05_ATBX_JAVA_Operators_part_2_ternary;

public class Lab001_Ternary_Odd_Even {
    public static void main(String[] args) {
        int num = 7;

        String result = (num%2 == 0)? "Even": "Odd";
        System.out.println(result);

        //Edge cases= float, neqative number, 0
    }
}
