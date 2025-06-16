package ex14_ATBX_StringBuilder_StringBuffer;

public class Lab004_SB {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Pooja");
        s1.append("Gaydhani");
        System.out.println(s1);

        s1.reverse();
        System.out.println(s1);

        s1.delete(7,10);
        System.out.println(s1);
    }
}
