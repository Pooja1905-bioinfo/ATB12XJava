package ATBX_Tasks.If_else;

import java.util.Scanner;

public class Task0025_SeniorCitizen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");

        int age = scanner.nextInt();

        if(age > 0 && age <= 12){
            System.out.println("You are a Child");
        }
        else if(age >= 13 && age <= 19){
            System.out.println("You are a Teenager");
        }

        else if(age >= 20 && age <= 65){
            System.out.println("You are an Adult");
        }

        else if(age > 65){
            System.out.println("You are a Senior citizen");
        }

        else{
            System.out.println("Please Enter the valid Age");
        }
    }
}
