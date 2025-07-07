package ATBX_Tasks.If_else;

import java.util.Scanner;

public class Task0011_Char_Is_Alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print the letter: ");
        String str = scanner.next();
        str.toLowerCase();

        for(int i = 0; i< str.length(); i++) {
            char ch = str.charAt(i);
            if(ch <= 'z' && ch >= 'a') {
                if(ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'){
                    System.out.println("Alphabet: " + ch + " is a vowel");
                }
                else{
                    System.out.println("Alphabet: "+ ch + " is a consonant");
                }

            }
            else{
                System.out.println("Not alphabet: " + ch);
            }
        }

    }
}
