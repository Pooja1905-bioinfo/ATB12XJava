package ex25_Exceptions;

import java.util.Scanner;

public class Lab212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        try {
            int a = 10/v;
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        } finally {
            scanner.close();
        }

    }
}
