package ex10_ATBX_While_loop;

import java.util.Scanner;

public class Lab005_Factorial_While_loop {
    public static void main(String[] args) {
        // user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a number: ");
        // n! = n*(n-1)*(n-2)*.......*2*1
        // input will be number n
        // 5! = 5*4*3*2*1
        if (!scanner.hasNextInt()){
            System.out.println("Invalid Input. Re-enter the number: ");
        }
        int fact = 1;
        int n = scanner.nextInt();
         if(n <= 0) {
             System.out.println("Factorial is always 1");
         }
         if(n > Integer.MAX_VALUE){
             System.out.println("Cannot get Factorial as Out of Range int value");
         }
         int i = 1;
         while ( i <= n ){
             fact = fact * i;
             i++;
             //i = number, number- 1, number - 2
         }
        System.out.println(fact);


        }
    }

