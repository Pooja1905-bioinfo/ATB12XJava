package ATBX_Tasks.If_else;

import java.util.Scanner;

public class Task005_AgeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Age:");
        int age = scanner.nextInt();
        if(age >= 18){
            System.out.println("Congratulations! You can Vote ");
        }
        else{
            System.out.println("You are under-age for voting");
        }
    }
}
