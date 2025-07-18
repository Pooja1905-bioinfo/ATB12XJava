package ATBX_Tasks.If_else;

import java.util.Scanner;

public class Task0018_ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you Units: ");
        int unit = scanner.nextInt();

        if(unit > 0){

        if(unit <= 100){
            System.out.println("Your Electricity bill is " + (unit*0.50) + "Rs");
        }

        else if(unit > 100 && unit <= 200){
            System.out.println("Your Electricity bill is " + (unit*0.75) + "Rs");
        }

        else if(unit > 200 && unit <= 300){
            System.out.println("Your Electricity bill is " + (unit*1.20) + "Rs");
        }

        else if (unit > 300 ) {
            System.out.println("Your Electricity bill is " + (unit*1.50) + "Rs");
        }

        }

        else{
            System.out.println("Please enter the valid unit");
        }

    }
}
