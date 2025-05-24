package ex05_ATBX_JAVA_Operators_part_2_ternary;

public class Lab003_User_Input {
    public static void main(String[] args) {
        String user_input = args[0];
        System.out.println(user_input instanceof String);
        System.out.println(user_input);
        int age = Integer.parseInt(user_input);
        System.out.println( age);
    }
}
