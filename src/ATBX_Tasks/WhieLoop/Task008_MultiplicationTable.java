package ATBX_Tasks.WhieLoop;

import java.util.Scanner;

public class Task008_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int num = scanner.nextInt();
        System.out.println("Multiplication of " + num);
        int i = 1;
        while(i<=10){
            int table = 0;
            table = num * i;
            System.out.printf("%d*%d=%d%n",num,i,table);
            i++;
        }
    }
}
