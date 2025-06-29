package ATBX_Tasks;

import java.util.Arrays;

public class Task22_FirstLetter {
    public static void main(String[] args) {
        String str1 = "Intermediate level of coding you can do";
        String [] words = str1.split(" ");
        //System.out.println(Arrays.toString(words));
        for(int i = 0; i < words.length; i++){
            String str2 = words[i];
            //System.out.println(str2);
            System.out.println(str2.charAt(0));
        }

    }
}
