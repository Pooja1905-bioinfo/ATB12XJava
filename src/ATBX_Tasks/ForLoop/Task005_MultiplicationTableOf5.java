package ATBX_Tasks.ForLoop;

public class Task005_MultiplicationTableOf5 {
    public static void main(String[] args) {
        System.out.println("Multiplication table of 5");
        for(int i = 1; i <= 10; i++){
            int table = 5*i;
            System.out.println(table);
        }
    }
}
