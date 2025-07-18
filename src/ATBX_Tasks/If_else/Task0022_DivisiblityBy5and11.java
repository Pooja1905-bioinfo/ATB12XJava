package ATBX_Tasks.If_else;

import java.util.Scanner;

public class Task0022_DivisiblityBy5and11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the number: ");
        int number = scanner.nextInt();

        if(number%5 == 0 && number% 11 == 0){
            System.out.println("Entered number is divisible by 5 and 11");
        }

        else {
            System.out.println("Entered number is not divisible by 5 and 11");
        }

    }
}
