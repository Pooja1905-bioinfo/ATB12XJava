package ex15_Array;

public class Lab003_array_maximum_number {
    public static void main(String[] args) {
        int [] marks = {89,90,76,89,87,43,98,76};

        int max_marks =  give_maximum_marks(marks);

        System.out.println("maximum_marks" + max_marks);
    }

    static int give_maximum_marks(int[]marks){
        int max= 0;
        for(int i =0; i < marks.length; i++){
            int hm = 0;
            int sm =0;

            if(marks[i] > max){
                max = marks[i];

            }

        }


        return max;
    }
}
