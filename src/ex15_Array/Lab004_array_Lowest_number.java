package ex15_Array;

public class Lab004_array_Lowest_number {
    public static void main(String[] args) {
        int [] array = {39, 65, 32, 19, 54, 76};
        int min_number = give_lowest_number(array);
        System.out.println("Lowest number is " +  min_number);

    }


    static int give_lowest_number(int[] array){

        int min_num = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < min_num ){
                min_num = array[i];
                }

        }
        return min_num;

    }

}
