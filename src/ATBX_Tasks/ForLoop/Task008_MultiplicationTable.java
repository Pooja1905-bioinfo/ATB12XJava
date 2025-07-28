package ATBX_Tasks.ForLoop;

import java.util.Scanner;

public class Task008_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int number = scanner.nextInt();
        System.out.println("Multiplication table of "+number);
        for(int i = 1; i <= 10; i++){
            int table =0;
            table=number*i;

            System.out.printf("%d*%d=%d%n",number,i, table);
        }
    }
}
