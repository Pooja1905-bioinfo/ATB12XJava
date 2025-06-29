package ATBX_Tasks;

public class Task26_SumOfArrayElements {
    public static void main(String[] args) {
        int []array =  {54, 65, 43, 21, 67};
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}
