package ATBX_Tasks.If_else;

import java.util.Scanner;

public class Task0021_VisaStatus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Age: ");
        int age = scanner.nextInt();
        System.out.println("Do you have valid Visa: ");
        String visaStatus = scanner.next();
        visaStatus.toLowerCase();

        if(age >= 18 && visaStatus.equalsIgnoreCase("Yes")){
            System.out.println("You can travel");
        }

        else if(age < 0){
            System.out.println("You have entered invalid age");
        }
        else{
            System.out.println("You cannot travel");
        }






    }
}
