package ATBX_Tasks.If_else;

import java.util.Scanner;

public class Task006_Largest_of_three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print the number 1: ");
        int n1 = scanner.nextInt();
        System.out.println("Print the number 2: ");
        int n2 = scanner.nextInt();
        System.out.println("Print the number 3: ");
        int n3 = scanner.nextInt();

        if (n1 > n2 && n1 > n3){
            System.out.println(n1 + " is a greater number");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is a greater number");
        }
        else{
            System.out.println(n3 + " is a greater number");
        }
    }
}
