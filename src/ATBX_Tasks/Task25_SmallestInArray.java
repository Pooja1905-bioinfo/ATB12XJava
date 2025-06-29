package ATBX_Tasks;

public class Task25_SmallestInArray {
    public static void main(String[] args) {
        int [] array = {65, 43, 21, 56, 78, 98, 32, 34, 20};
        int smallestNumber = array[0];
        for(int i = 0; i < array.length; i++ ){
            if(smallestNumber > array[i]){
                smallestNumber = array[i];
            }
        }
        System.out.println(smallestNumber);
    }
}
