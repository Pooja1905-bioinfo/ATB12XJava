package ATBX_Test01;

import java.util.Scanner;

public class ATBX_Question11_Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        for(int i =1; i <= num; i++){
            System.out.print(i + " ");
        }
    }
}
