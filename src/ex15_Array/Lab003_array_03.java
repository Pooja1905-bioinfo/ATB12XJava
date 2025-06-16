package ex15_Array;

public class Lab003_array_03 {
    public static void main(String[] args) {
        int [] marks = {81,92,83,74,95,76};

       // System.out.println(marks);
        for(int i =0; i < marks.length; i++){
            //System.out.println(i);
        }

        System.out.println("--------Enhaced for loop---------");

        for(int element : marks){
            System.out.println(element);
        }
    }
}
