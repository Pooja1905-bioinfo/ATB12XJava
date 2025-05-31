package ATBX_Tasks;

import java.util.Scanner;

public class Task9_Leap_Year {
    public static void main(String[] args) {
        System.out.println("Enter a Year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        // leap year rules
        // A=Divisible by 4 = true    always
        // B=Divisible by 100 = true or false only if C = divisible by 400

        // ( A && B ) || C = true then only leap year
        // (true && true) || true = leap year
        // (true && false) || true = leap year
        // (false && true ) || false = not leap year
        // (false && true ) || true = leap year


        if (( year%4 == 0 && year%100 != 0 ) || ( year%400 == 0 )) {
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("It is not leap year");
            }
        }

    }

