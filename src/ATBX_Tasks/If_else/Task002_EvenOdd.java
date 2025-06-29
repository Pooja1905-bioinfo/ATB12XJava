package ATBX_Tasks.If_else;

import java.util.Scanner;

public class Task002_EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number here: ");
        int number = scanner.nextInt();
        if(number % 2 == 0){
            System.out.println("It is a Even number");
        }
        else{
            System.out.println("It is a Odd number");
        }
    }
}
