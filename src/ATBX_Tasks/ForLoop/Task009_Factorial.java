package ATBX_Tasks.ForLoop;

import java.util.Scanner;

public class Task009_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int number = scanner.nextInt();
        if(number == 0 || number == 1){
            System.out.println("factorial is always 1");
        }
        else if(number > 1) {
            for(int i = number-1; i >=1; i--){
                number = number *i;
            }
        }
        System.out.println(number);
    }
}
