package ATBX_Tasks.WhieLoop;

import java.util.Scanner;

public class Task009_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int fact = scanner.nextInt();

        int i = fact-1;
        while(i >=1){
            fact = fact * i;
            i--;
        }
        System.out.println(fact);
    }
}
