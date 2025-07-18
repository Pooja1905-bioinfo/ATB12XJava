package ATBX_Tasks.If_else;

import java.util.Scanner;

public class Task0017_LoanEligible {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();


        Math.min(age, 18);
        Math.max(age, 80);


        if (age >= 18 && age <= 80) {
            System.out.println("Passing Age criteria");
            System.out.println("Please Enter your current salary: ");
            double salary = scanner.nextDouble();
            if (salary >= 30000.0) {
                System.out.println("Passing salary criteria");
                System.out.println("Please Enter your credit score: ");
                int creditScore = scanner.nextInt();
                if (creditScore >= 650 && creditScore <= 850) {
                    System.out.println("You are eligible for personal loan");
                }
                else {
                    System.out.println("You are not eligible for loan");
                }}
            else{
                    System.out.println("You are not eligible for loan");

                }}

        else{
                    System.out.println("Your are not eligible for loan");
                }

            }
        }

