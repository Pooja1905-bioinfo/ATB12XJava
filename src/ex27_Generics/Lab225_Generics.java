package ex27_Generics;

public class Lab225_Generics {
    public static void main(String[] args) {
        sum(1,2);
        sum(3.4, 5.6);
        sum("Pooja", "Gaydhani");
    }

    static <T> T sum(T a, T b){
        System.out.println(a + "" +b);
        return null;
    }
}
