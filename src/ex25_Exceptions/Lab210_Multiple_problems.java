package ex25_Exceptions;

public class Lab210_Multiple_problems {
    public static void main(String[] args) {
       int a = 0;
       int c = 0;
        try {
            c = 10/a;
            String s1 = null;
            try {
                s1.trim();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
