package ATBX_Tasks.If_else;

import java.util.Enumeration;
import java.util.Scanner;

public class Task0015_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int numberOfDigit = 0;

        numberOfDigit = String.valueOf(number).length();

        System.out.println(numberOfDigit);

        for (int i = number; i != 0; i /=10){
            int powerOfDigit =0;
            int lastDigit = 0;

            lastDigit = i % 10;
            powerOfDigit = (int)Math.pow(lastDigit, numberOfDigit);

            sum += +powerOfDigit;
        }

        System.out.println(sum);
        System.out.println(number);



        if(sum == number){
            System.out.println("Your Number is Armstrong number");
        }

        else{
            System.out.println("It is not Armstrong Number");
        }




    }
}
