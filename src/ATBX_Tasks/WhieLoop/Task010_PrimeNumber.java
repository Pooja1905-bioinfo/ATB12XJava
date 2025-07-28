package ATBX_Tasks.WhieLoop;

import java.util.Scanner;

import static ATBX_Tasks.WhieLoop.primeChecker.isPrime;

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

class primeChecker{
    public static boolean isPrime(int n){
        if(n<=1) return false;
        int limit = (int)Math.sqrt(n);
        int i = 2;
        while(i <= limit) {
            i++;
            if (n % i == 0) return false;
        }
        return true;
        }
    }

