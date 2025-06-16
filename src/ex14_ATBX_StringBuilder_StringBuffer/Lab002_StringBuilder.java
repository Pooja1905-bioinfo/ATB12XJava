package ex14_ATBX_StringBuilder_StringBuffer;

public class Lab002_StringBuilder {
    public static void main(String[] args) {
        String s1 = "Pooja";
        StringBuffer str1 = new StringBuffer("Gaydhani");
        StringBuilder str2 = new StringBuilder("Pooja");
        System.out.println(str2);
        System.out.println(str1);

        System.out.println(str1.reverse());
    }
}
