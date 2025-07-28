package ATBX_Tasks.ForLoop;

import java.util.Scanner;

import static ATBX_Tasks.ForLoop.primeChecker.isPrime;

public class Task010_PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (isPrime(num)){
            System.out.println(num + " is a prime number");
        }
        else{
            System.out.println(num + " is not a prime number");
        }

    }
}

class primeChecker {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        int limit = (int) Math.sqrt(n);
        for (int i = 2; i <= limit; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
