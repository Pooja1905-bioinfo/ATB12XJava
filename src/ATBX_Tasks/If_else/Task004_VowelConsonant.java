package ATBX_Tasks.If_else;

import java.util.Scanner;

public class Task004_VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string here: ");
        String str = scanner.next();
        str = str.toLowerCase();
        for(int i= 0; i < str.length();i++){
            char ch = str.charAt(i);

            if(ch == 'a' ||ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println(ch + " is a vowel");
            }
            else if( ch >= 'a' && ch <= 'z' ){
                System.out.println(ch + " is a consonant");
            }
        }
    }
}
