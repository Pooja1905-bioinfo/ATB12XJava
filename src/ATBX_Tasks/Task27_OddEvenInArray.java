package ATBX_Tasks;

public class Task27_OddEvenInArray {
    public static void main(String[] args) {
        int [] array = {67, 85, 43, 23, 19, 93, 58, 44, 72, 36};
        int oddc =0;
        int evenc= 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                evenc++;
                System.out.println("Even numbers " + array[i]);
            }
            else{
                oddc++;
                System.out.println("Odd Numbers " + array[i]);
            }
        }
        System.out.println("Total Even numbers " + evenc);
        System.out.println("Total Odd numbers " + oddc);
    }
}
