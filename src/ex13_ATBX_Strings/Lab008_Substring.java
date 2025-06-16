package ex13_ATBX_Strings;

public class Lab008_Substring {
    public static void main(String[] args) {
        String s1 = "Java Programming";

        CharSequence s = s1.subSequence(2,16);
        System.out.println(s);

        System.out.println("Gaydhani".substring(5));

        char [] arr = "JAVA".toCharArray();
        System.out.println(arr);

        String st = " JAVA ".trim();
        System.out.println(st);
    }
}
