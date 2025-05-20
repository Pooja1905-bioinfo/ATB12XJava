package ex03_ATBX_JAVA_literals;

public class Lab008_PrintF {
    public static void main(String[] args) {
        int a = 789;
        System.out.println(a);
        System.out.printf("Your variable is %d", a);

        //%d -> int, byte, short, long = data types
        //%s -> string
        //%f -> float
        //%b -> boolean

        int b = 10;
        System.out.println();
        System.out.printf("a = %d b =%d", a, b);
        System.out.println();
        System.out.printf("a =" + a + ", b = " +b);

    }
}
