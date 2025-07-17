package ATBX_Tasks.Task_OOPs_Inheritance.MethodOverloading.Task003_MultiplyNumbers;

public class MathOperations {
    public static void main(String[] args) {
        Multiply m1 = new Multiply();
        Multiply m2 = new Multiply();
        Multiply m3 = new Multiply();

        m1.multiply(5, 8, 9);
        m2.multiply(7,8);
        m3.multiply(9, 7, 0);
    }

}

class Multiply{
    public void multiply(int a, int b){
        System.out.println(a*b);
    }

    public void multiply(int a, int b, int c){
        System.out.println(a*b*c);

    }
}
