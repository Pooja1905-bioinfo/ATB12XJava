package ATBX_Test01;

import java.util.Scanner;

public class ATBX_Question6_Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number here: ");
        int num = scanner.nextInt();

        if(num > 0){
            System.out.println("Entered number is positive");
        }
        else if(num < 0){
            System.out.println("Entered number is negative");
        }
        else{
            System.out.println("Enter the valid number");
        }
    }
}
