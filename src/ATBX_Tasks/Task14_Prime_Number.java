package ATBX_Tasks;

import java.util.Scanner;

public class Task14_Prime_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        for (int i = 3; i <= 100; i++) {
            if ((number % 2 != 0) || (number % 3 != 0) || (number % 5 != 0)) {
                System.out.println(number + " is not a prime number");
            } else {
                System.out.println(number + " is a prime number");
            }
        }
    }}



