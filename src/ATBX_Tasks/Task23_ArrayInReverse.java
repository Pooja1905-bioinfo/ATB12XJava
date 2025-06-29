package ATBX_Tasks;

public class Task23_ArrayInReverse {
    public static void main(String[] args) {
        int [] array = {65 ,76, 87, 98, 54, 32, 12, 78};
        int [] reverse = new int[array.length];
        for(int i = 0; i < array.length ; i++){
            reverse[i] = array[array.length -1 -i];}
        System.out.println("Reverse of array: ");

        for(int num : reverse){
            System.out.print(num + " ");
        }
    }
}
