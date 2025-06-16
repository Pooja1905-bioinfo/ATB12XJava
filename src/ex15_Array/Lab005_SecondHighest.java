package ex15_Array;

public class Lab005_SecondHighest {
    public static void main(String[] args) {
        int[] array = {89, 98, 67, 84, 79, 97};
        int SecondHighest = give_second_highest(array);
        System.out.println("Second Highest Number: " + SecondHighest);

    }

    static int give_second_highest(int[] array) {

        int highest= 0;
        int Second_Number = 0;

        for (int num: array) {

            if (num > highest  ) {
                Second_Number = highest;
                highest = num;}
            else if( num > Second_Number && num != highest){
                Second_Number = num; }


            }
        return Second_Number;
    }

}