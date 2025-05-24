package ex06_ATBX_JAVA_In_Dec_Operator;

public class Lab003_Advance_ID {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++);  // printed as 10 but stored as 11 -> 10
        System.out.println(a++ + a); // printed as 11 but stored as 12 -> 23
        System.out.println(a++); // printed as 12 but stored as 13 -> `12
        System.out.println(a++); // printed as 13 but stored as 14
        System.out.println(a++ + a); // 14 + 15 = 29
        System.out.println(a++ + a); // 15 + 16 = 31
        // while addition value of a++ will be 11 and a value becomes

        // a++ stored as 10 -> line 6 output is 10
        // but after printing a++ stored as 11 in line 6, after then in line 7 again a++ that means 11+1 happens
        // Value of a in line 7 stored as 12 + a value become
        // ERT
        //Ln n | a | b
        //5 | 10 | na
        //6 | na | 10
        //7 | 11 | 11
    }
}
