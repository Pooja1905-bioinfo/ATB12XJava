package ATBX_Tasks;

public class Task20_Stringcount {
    public static void main(String[] args) {
        String str1 = "Intermediate level of coding you can do";

        str1 = str1.replaceAll("\\s+", " ");
        String[] word = str1.split(" ");
        System.out.println(word.length);
    }
}
