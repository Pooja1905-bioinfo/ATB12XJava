package ATBX_Tasks.If_else;

import java.util.Scanner;

public class Task009_Leap_Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print the Year: ");
        int year = scanner.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " is Leap Year");
        }
        else {
            System.out.println(year+ " is not leap year");
        }
    }
}
