package ex13_ATBX_Strings;

public class question {
    public static void main(String[] args) {
        System.out.println("hello".length());
        String a = "pooja";
        String b = "pooja";
        System.out.println(a.indexOf(a));
        System.out.println(a==b);

        String s1 = new String("Java");
        String s2 = "Java";
        boolean b1 = s1 == s2;
        System.out.println(b1);
        System.out.println("Hello".equals(null));
        System.out.println(s1.compareTo(s2));
        String p1 = "abc"; String p2 = "ABC";
        System.out.println(p1.compareToIgnoreCase(p2));
        String n = null;
        System.out.println(n.length());
        System.out.println(p1.formatted());
    }
}
