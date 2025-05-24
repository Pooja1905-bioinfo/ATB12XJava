package ATBX_Tasks;

import java.util.Scanner;

public class Task4_17th_May_Ternary_Operator_Max_of_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number 1: ");
        int n1 = scanner.nextInt();

        System.out.println("Enter Number 2: ");
        int n2 = scanner.nextInt();

        System.out.println("Enter Number 3: ");
        int n3 = scanner.nextInt();

        int result = (n1 > n2 && n1 > n3)? n1 : (n2> n3)? n2 : n3;

        System.out.println("The Maximum Numner is " + result);

    }
}
