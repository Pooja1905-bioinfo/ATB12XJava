package ATBX_Tasks.If_else;

import java.util.Scanner;

public class Task0012_ATM_Simulation {
    public static void main(String[] args) {
        int accountBalance = 10000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw: ");
        int amountWithdraw = scanner.nextInt();

        if((amountWithdraw > 0 && amountWithdraw % 100 == 0) && amountWithdraw < accountBalance){
            System.out.println(amountWithdraw + " deducted from your account");
            int remainingBalance = accountBalance - amountWithdraw;
            System.out.println("Account Balance: " + remainingBalance);
        }
        else if (amountWithdraw> accountBalance) {
            System.out.println("Insufficient balance");
        }

        else if (amountWithdraw % 100 != 0){
            System.out.println("Please enter the amount 100, 200 or 500");
        }

        else {
            System.out.println("Invalid Amount");
        }


    }
}
