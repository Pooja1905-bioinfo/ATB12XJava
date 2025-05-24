package ex07_ATBX_JAVA_If_Else;

import java.util.Scanner;

public class Lab004_If_Else_Scanner_class {
    public static void main(String[] args) {
        System.out.println("Please Enter Your Age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age > 18){
            System.out.println("You are allowed to vote");}
        else {
            System.out.println("You are not allowed to vote");
        }
    }
}
