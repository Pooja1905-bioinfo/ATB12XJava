package ex12_ATBX_Functions;

import java.util.Scanner;

public class Lab004_UD_Part1 {
    public static void main(String[] args) {
        //User defined function types

        //1.Without parameter and without return type
        greet_fun();

        //2.Without parameter and with return type
        String message = greet_with_return();
        System.out.println(message);

        Scanner scanner = new Scanner(System.in);

        /*3.With parameter and without return type

        System.out.println("Enter Your Name: ");
        String name = scanner.next();
        System.out.println("Enter Your Age: ");
        int age = scanner.nextInt();
        System.out.println("Enter Your Salary: ");
        double salary = scanner.nextDouble();
        greet_with_details(name, age, salary);

         */

        //4.With parameter and with return type
        System.out.println("Enter number 1:");
        int a = scanner.nextInt();
        System.out.println("Enter number 2:");
        int b = scanner.nextInt();
        System.out.println("Enter number 3:");
        int c = scanner.nextInt();

       int sum = sum_of_the_three_numbers(a,b,c);
        System.out.println(sum);


    }

    //1.Without parameter and without return type
    static void greet_fun(){
        System.out.println("Hi");
    }

    //2.Without parameter and with return type
    static String greet_with_return(){
        System.out.println("Good Morning");
        return "Have a good day";
    }

    //3.With parameter and without return type
    static void greet_with_details(String name, int age, double salary){
        System.out.println("Your name is "+ name + "\nYour age is " + age + "\nYour salary is " + salary);
    }

    //4.With parameter and with return type

    static int sum_of_the_three_numbers(int a, int b, int c){
        return a + b + c;

    }







}
