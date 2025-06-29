package ATBX_Tasks.ForLoop;

public class Task002_EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Even Numbers fro 1 to 20:");
        for(int i = 0; i<= 20; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
