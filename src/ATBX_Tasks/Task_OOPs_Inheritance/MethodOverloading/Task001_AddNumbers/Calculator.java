package ATBX_Tasks.Task_OOPs_Inheritance.MethodOverloading.Task001_AddNumbers;

public class Calculator {
    public static void main(String[] args) {
        Addition add1 = new Addition();
        Addition add2 = new Addition();

        add1.add(6.3, 7.6);
        add2.add(12, 98);
    }
}

class Addition{
    public void add(int a, int b){
        System.out.println(a+b);
    }

    public void add(double a, double b){
        System.out.println(a+b);
    }
}


