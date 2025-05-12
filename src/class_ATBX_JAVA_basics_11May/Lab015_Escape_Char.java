package class_ATBX_JAVA_basics_11May;

public class Lab015_Escape_Char {
    public static void main(String[] args) {
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';
        System.out.println("Pooja"+new_line+"Gaydhani");
        System.out.println("Pooja\nGaydhani");
        System.out.println("Pooja\tGaydhani");
        System.out.println("Pooja"+tab_line+"Gaydhani");
        System.out.println("Pooja   "+back_space+"Gaydhani");
        System.out.println("Pooja   \bGaydhani");
    }
}
