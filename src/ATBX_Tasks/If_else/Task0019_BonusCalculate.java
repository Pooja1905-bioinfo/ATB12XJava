package ATBX_Tasks.If_else;

import java.util.Scanner;

public class Task0019_BonusCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();
        System.out.println("Enter your years of experience in Years: ");
        int yearOfExp = scanner.nextInt();

        if(yearOfExp <= 1){
            System.out.println("Bonus amount is 0");
        }
        else if(yearOfExp > 1 && yearOfExp <= 3){
            System.out.println("Bonus amount is " + ( salary * 0.05));
        }

        else if(yearOfExp >= 4 && yearOfExp < 6) {
            System.out.println("Bonus amount is " + (salary * 0.1));
        }
        else if(yearOfExp >= 6 ) {
            System.out.println("Bonus amount is " + (salary * 0.15));
        }



    }
}
