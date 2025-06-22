package ATBX_Test01;

import java.util.Scanner;

public class ATBX_Question7_Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the number 2: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the number 3: ");
        int num3 = scanner.nextInt();

        if((num1 > num2) && (num1 > num3)){
            System.out.println("Largest Number is: " +num1);
        }
        else if((num2 > num1) && (num2 > num3)){
            System.out.println("Largest Number is: " +num2);
        }
        else{
            System.out.println("Largest Number is: " +num3);
        }
    }
}
