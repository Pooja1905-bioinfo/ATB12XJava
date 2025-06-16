package ATBX_Tasks;

import java.util.Scanner;

public class Task13_reverse_of_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");

        String str = scanner.next();

        String result = "";

        for(int i = str.length()- 1; i >= 0; i--){
            char ch = str.charAt(i);
            result = result + ch;

        }

        System.out.println(result);
    }
}
