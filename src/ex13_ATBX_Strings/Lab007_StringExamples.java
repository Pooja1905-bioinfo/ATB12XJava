package ex13_ATBX_Strings;

public class Lab007_StringExamples {
    public static void main(String[] args) {
        String s1 = "Java";

        char ch = s1.charAt(0);
        System.out.println(ch);

        System.out.println(s1.codePointAt(3));


        //CompareTonIgnore case ****

        int result = "POOJA".compareToIgnoreCase("pooja");
        System.out.println(result);

        int result2 = "POOJA".compareTo("pooja");
        System.out.println(result2);



        int a = "Java".indexOf("J");
        System.out.println(a);

        boolean b = "".isEmpty();
        System.out.println(b);

        String str2 = String.join("-","JAVA", "PROGRAMMING");
        System.out.println(str2);
        String str3 = "Java".replace('a','o');
        System.out.println(str3);

        boolean b1 = "Java".startsWith("va");
        System.out.println(b1);
    }
}
