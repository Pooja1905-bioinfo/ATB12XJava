package ATBX_Test01;

import java.util.Scanner;

public class ATBX_Question8_Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        //true || false && true

        if((year % 4 == 0 || year % 100 ==0 ) && year % 400 ==0){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }

    }
}
