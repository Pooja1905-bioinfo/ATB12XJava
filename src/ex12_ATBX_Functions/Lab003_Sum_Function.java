package ex12_ATBX_Functions;

import java.util.Scanner;

public class Lab003_Sum_Function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number 1: ");
        int a = scanner.nextInt();
        System.out.println("Please enter number 2: ");
        int b = scanner.nextInt();

        int r1 = sum_of_the_numbers(a ,b);
        System.out.println(r1);

    }

    static int sum_of_the_numbers(int a, int b){
        return a + b;
    }
}
