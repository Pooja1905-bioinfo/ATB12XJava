package ATBX_Tasks;

import java.util.Scanner;

public class Task11_Grade { public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please Enter Your Percentage: ");
    int percentage = scanner.nextInt();
    String grade;

    switch (percentage/10) {
        case 10:
        case 9:
            grade = "Excellent";
            break;
        case 8:
            grade = "Very Good";
            break;
        case 7:
            grade = "Good";
            break;
        case 6:
            grade = "Need Improvement";
            break;
        default:
            grade = "Fail";
            break;

    }
    System.out.println("Percentage: " + percentage+ " %, Grade: " + grade);



}
}



