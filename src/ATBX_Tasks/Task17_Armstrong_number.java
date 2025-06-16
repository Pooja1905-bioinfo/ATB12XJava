package ATBX_Tasks;

import javax.management.StringValueExp;
import java.util.Scanner;

public class Task17_Armstrong_number {
    public static void main(String[] args) {
        // 67 = 6^3 + 7^3 number should match
        System.out.println("Please enter the number: ");

        Scanner scanner = new Scanner(System.in);
        int NewNumber = scanner.nextInt();

        //System.out.println(NewNumber);

        int SumOfNumber = 0;
        int NumberOfDigit=0;

        NumberOfDigit = String.valueOf(NewNumber).length();
        System.out.println("Total Number of Digit: " + NumberOfDigit);

        //int Sum1;



        for(int i =NewNumber ;i != 0; i/=10){

            int PowerOfLastDigit = 0;
            int LastDigit  = 0;
            LastDigit = i % 10;

            PowerOfLastDigit = (int)Math.pow(LastDigit, NumberOfDigit);

            //System.out.println(PowerOfLastDigit);

            SumOfNumber += +PowerOfLastDigit;

            //System.out.println(LastDigit);

        }

        System.out.println("Number that you have entered: " + NewNumber);
        //SumOfNumber = ;

        System.out.println("Sum of the Number is: "  + SumOfNumber);

        if(NewNumber == SumOfNumber){
            System.out.println("Given number is Armstrong Number");}
        else{
            System.out.println("Given Number is not Armstrong Number");
        }




    }
}
