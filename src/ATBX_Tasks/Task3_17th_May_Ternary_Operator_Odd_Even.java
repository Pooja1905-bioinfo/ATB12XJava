package ATBX_Tasks;

import java.util.Scanner;

public class Task3_17th_May_Ternary_Operator_Odd_Even {
    public static void main(String[] args) {
        System.out.println("Please enter number: ");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        String result = (n1%2 == 0)? "It is a Even Number" : "It is a Odd Number";
        System.out.println(result);
    }
}
