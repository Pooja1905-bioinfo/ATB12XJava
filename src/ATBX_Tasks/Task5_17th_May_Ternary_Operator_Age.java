package ATBX_Tasks;

import java.util.Scanner;

public class Task5_17th_May_Ternary_Operator_Age {
    public static void main(String[] args) {
        System.out.println("Please Enter your Age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        String result = (age < 18)? "You are a minor" : (age > 65)? "You are a Senior Citizen" : "You are an Adult ";
        System.out.println(result);
    }
}
