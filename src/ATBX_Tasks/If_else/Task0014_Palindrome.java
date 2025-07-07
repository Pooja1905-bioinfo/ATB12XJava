package ATBX_Tasks.If_else;

import java.util.Scanner;

public class Task0014_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        //12321
        int newNumber = number;
        int reverse = 0;

        for(int i = 0; number != 0 ; number/=10 )
        {
            i = number%10;
            reverse = reverse*10 +i;

        }
        System.out.println(number);
        System.out.println(reverse);

        if(newNumber == reverse){
            System.out.println(newNumber + " is palindrome");
        }
        else{
            System.out.println(newNumber +  "is Not palindrome");
        }
    }




}
