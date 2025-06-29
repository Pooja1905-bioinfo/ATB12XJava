package ATBX_Tasks.If_else;

import java.util.Scanner;

public class Task003_MaximumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number 1: ");
        int a = scanner.nextInt();
        System.out.println("Enter a number 2: ");
        int b = scanner.nextInt();

        if(a > b){
            System.out.println(a + " is greater than " + b);
        }
        else{
            System.out.println(b + " is greater than " + a);
        }
    }
}
