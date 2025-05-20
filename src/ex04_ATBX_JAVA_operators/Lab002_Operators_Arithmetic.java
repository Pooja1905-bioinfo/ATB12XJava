package ex04_ATBX_JAVA_operators;

public class Lab002_Operators_Arithmetic {
    public static void main(String[] args) {
        // arithmetic operators require 2 operands
        int a = 20;
        int b = 3;
        float c = 3.0f;
        System.out.println(a+b);  // Addition
        System.out.println(a-b);  //Substraction
        System.out.println(a/b);  // Division
        System.out.println(a*b);  // Multiplication

        System.out.println(a/c);   // Division by float always returns float
        System.out.println("a+b");  //String
    }
}
