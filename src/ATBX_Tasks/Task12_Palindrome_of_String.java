package ATBX_Tasks;

import java.util.Scanner;

public class Task12_Palindrome_of_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scanner.next();

        // MADAM = MADAM

        // Pooja = ajoop

       // System.out.println(str.length()-1);

        String result = "";



        for(int i = str.length()-1 ; i >= 0 ; i--){                // position of charaterr at i
            char ch = str.charAt(i);
            result = result + ch;}
            System.out.print(result);

        if(result.equals(str)){
            System.out.println("\nIts a palindrome");}
        else{
            System.out.println("\nIt is not palindrome");
        }






    }
}
