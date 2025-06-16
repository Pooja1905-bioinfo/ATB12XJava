package ATBX_Tasks;

public class Task17_FizzBuzz {
    public static void main(String[] args) {

        System.out.println("Fizzbuzz Test");

        for(int i =1; i <=100; i++){
            if((i % 5 ==0) && (i % 3 == 0)){
                System.out.println("FizzBuzz+");}
            else if(i % 3 == 0){
                System.out.println("Fizz");}
            else if(i % 5 ==0){
                System.out.println("Buzz");}
            else{
                System.out.println(i);
            }
        }

    }
}
