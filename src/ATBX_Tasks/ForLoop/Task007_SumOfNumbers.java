package ATBX_Tasks.ForLoop;

public class Task007_SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum = sum + i;
        }
        System.out.println("Sum of the numbers from the 1 to 100: " + sum);

    }
}
