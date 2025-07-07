package ATBX_Tasks.If_else;

import java.util.Scanner;

public class Task0010_Grade_Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks in %: ");
        int marks = scanner.nextInt();
        
        if(marks < 0 || marks > 100){
            System.out.println("Please enter valid marks");
        }
        
        if(marks >= 75){
            System.out.println("Your grade is A");
        } else if (marks >= 60) {
            System.out.println("Your grade is B");
        }
        else if(marks >= 45 ){
            System.out.println("Your grade is C");
        }
        else if (marks >= 35){
            System.out.println("Your grade is D");
        }
        else{
            System.out.println("You are fail");
        }
    }
}
