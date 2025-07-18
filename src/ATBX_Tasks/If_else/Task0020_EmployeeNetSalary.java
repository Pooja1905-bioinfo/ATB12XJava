package ATBX_Tasks.If_else;

import java.util.Scanner;

public class Task0020_EmployeeNetSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your Basic salary:");
        double salary = scanner.nextDouble();

        double hra = salary * 0.3;
        double da = salary * 0.15;

        double gross = salary + hra + da;

        double applicableTax = 0;


        double taxDeduction = gross*applicableTax;

        if (gross <= 250000.0){
            double netSalary = gross;
            System.out.println("Your net salary is "+ netSalary +" per annum");
        }

        else if (gross > 250000 && gross <= 500000){
            applicableTax = gross * 0.05;
            double monthlyDeduction = applicableTax/12;
            double netSalary = gross - monthlyDeduction;
            System.out.println( "Your net salary is "+ netSalary);
        }

        else if (gross > 500000 && gross <= 1000000){
            applicableTax = gross * 0.1;
            double monthlyDeduction = applicableTax/12;
            double netSalary = gross - monthlyDeduction;
            System.out.println( "Your net salary is "+ netSalary);
        }

        else if (gross >= 500000){
            applicableTax = gross * 0.1;
            double monthlyDeduction = applicableTax/12;
            double netSalary = gross - monthlyDeduction;
            System.out.println( "Your net salary is "+ netSalary);
        }

        else{
            System.out.println("Please enter the valid amount");
        }


    }
}
