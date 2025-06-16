package ex13_ATBX_Strings;

public class Lab005_String_4 {
    public static void main(String[] args) {
        String s1 = "Hello";       //string 1
        String s2 =  new String("Hello");
        String s3 = "Hello";
        String s10 = "Hello";
        String s4 = new String("Hello");

        // 1 string in SCP and 2strings in OA

        String s5 = "hello"; // 2 in SCP

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s10);
        System.out.println(s2 == s4);


        //equals

        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equalsIgnoreCase(s5));

    }



}
