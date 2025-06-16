package ATBX_Tasks;

public class Task15_Prime_Number_For_loop {
    public static void main(String[] args) {

        //prime number concept
        //if number is divisible by itself and 1 only= prime number
        //i / i ,  10 divisible by 2,1,5

        for(int i= 2; i<= 100; i++ ){
            if((i % 2 != 0 || i % 3 != 0) || i % 5 != 0){
                System.out.println(i + " is prime number");
            }
            //else{
                //System.out.println(i + " is not prime number");

            }
        }
    }
//
// }
