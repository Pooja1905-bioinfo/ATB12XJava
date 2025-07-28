package ATBX_Tasks.WhieLoop;

public class Task007_SumOfNumbers {
    public static void main(String[] args) {
        int sum =0;
        int i = 100;
        while(i >=1){
            sum = sum +i;
            i--;
    }
        System.out.println("Sum of the numbers from 1 to 100: " + sum);
    }

}
