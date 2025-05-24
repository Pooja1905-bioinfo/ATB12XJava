package ex05_ATBX_JAVA_Operators_part_2_ternary;

public class Lab004_Real_Age_classification {
    public static void main(String[] args) {
        String user_input = args[0];
        System.out.println("Your age is " + user_input);
        int age = Integer.parseInt(user_input);
        String result = (age < 18)? "You are Minor. Sorry Not allowed" : (age < 65)? "Congratulations You are Adult" : "Hey Senior Citizen Take care";
        System.out.println(result);

    }
}
