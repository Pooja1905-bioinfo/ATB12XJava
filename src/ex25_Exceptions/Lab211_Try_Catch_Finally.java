package ex25_Exceptions;

public class Lab211_Try_Catch_Finally {
    public static void main(String[] args) {
        int a = 1;
        int c = 0;
        try {
            c = 10/a;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("I will be always executed");
        }
        System.out.println(c);

    }
}
