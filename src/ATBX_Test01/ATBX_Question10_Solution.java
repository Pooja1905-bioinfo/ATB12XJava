package ATBX_Test01;

import java.util.Scanner;

public class ATBX_Question10_Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = scanner.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = scanner.nextInt();
        System.out.println("Enter the method: ");
        String exp = scanner.next();


        switch (exp) {
            case "addition":
                System.out.println(a + b);
                break;
            case "substraction":
                System.out.println(a - b);
                break;
            case "multiplication":
                System.out.println(a * b);
                break;
            case "division":
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid number");
    }
}}
