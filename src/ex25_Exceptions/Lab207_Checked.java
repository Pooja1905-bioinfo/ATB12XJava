package ex25_Exceptions;

public class Lab207_Checked {
    public static void main(String[] args) {
        int a = 0;
        try {
            a = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        System.out.println(a);
    }
}
