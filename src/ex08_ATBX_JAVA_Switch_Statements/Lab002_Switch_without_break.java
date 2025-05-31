package ex08_ATBX_JAVA_Switch_Statements;

import java.util.Scanner;

public class Lab002_Switch_without_break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day 1 to 7: ");


        if(scanner.hasNextInt()){
            int day = scanner.nextInt();
            switch (day){

                case 1:
                    System.out.println("Mon");

                case 2:
                    System.out.println("Tue");

                case 3:
                    System.out.println("Wed");

                case 4:
                    System.out.println("Thur");

                case 5:
                    System.out.println("Fri");

                case 6:
                    System.out.println("Sat");

                case 7:
                    System.out.println("Sun");


                default:
                    System.out.println("Enter only 1 to 7 values");

            }}
        else {
            System.out.println("Please Enter only Integer");    //it will check if input entered is integer or not
        }


    }
}
