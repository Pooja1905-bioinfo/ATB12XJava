package ATBX_Tasks;

public class Task24_LargestInArray {
    public static void main(String[] args) {
        int[] array = {56, 76, 87, 98, 54, 34, 23};
        int largeNumber = 0;

        for(int i = 0 ; i < array.length; i++){

            if(array[i] > largeNumber){
                largeNumber= array[i];
            }
        }
        System.out.println(largeNumber);

    }
}
