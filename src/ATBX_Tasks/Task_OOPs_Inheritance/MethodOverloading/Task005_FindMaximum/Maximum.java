package ATBX_Tasks.Task_OOPs_Inheritance.MethodOverloading.Task005_FindMaximum;

public class Maximum {
    public static void main(String[] args) {
        Utility u1 = new Utility();
        Utility u2 = new Utility();
        Utility u3 = new Utility();

        u1.max(8,9);
        u2.max(10,98,11);
        u3.max(6.5,7.6);
    }

}

class Utility{
    public void max(int a, int b){
        System.out.println("Maximum number of 2 Integers: " + Math.max(a,b));

    }
    public void max(int a, int b, int c){
        if(a > b && a > c){
            System.out.println("Maximum number is " + a);
        }
        else if(b > c && b > a){
            System.out.println("Maximum number is " + b);
        }
        else{
            System.out.println("Maximum number is " + c);
        }

    }
    public void max(double a, double b){
        System.out.println("Maximum number of 2 doubles: " + Math.max(a,b));

    }
}
