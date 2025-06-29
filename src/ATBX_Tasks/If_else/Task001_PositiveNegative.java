package ATBX_Tasks.If_else;

import java.util.Scanner;

public class Task001_PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number here: ");
        int number = scanner.nextInt();
        if(number >= 0){
            System.out.println("It is a positive number");
        }
        else{
            System.out.println("It is a negative number");
        }
    }
}
