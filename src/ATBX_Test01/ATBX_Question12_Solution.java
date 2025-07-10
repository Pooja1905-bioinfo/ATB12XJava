package ATBX_Test01;

import java.util.Scanner;

public class ATBX_Question12_Solution {
    public static void main(String[] args) {
        System.out.println("Enter a positive number: ");
        Scanner scanner = new Scanner(System.in);

        int fact = 7;

        // n! = n*(n-1)*(n-2)*.......*2*1
        // input will be number n
        // 5! = 5*4*3*2*1
        //
        if ((fact == 1) || (fact == 0)) {
            System.out.println("Factorial of given number is 1 ");
        } else if (fact > 1) {
            for (int i = fact - 1; i >= 1; i--) {
                fact = fact * i;
            }
            System.out.println(fact);
        } else {
            System.out.println("Negative number factorial does not exist");
        }
    }
}
