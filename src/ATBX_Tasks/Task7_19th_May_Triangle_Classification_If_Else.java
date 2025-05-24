package ATBX_Tasks;

import java.util.Scanner;

public class Task7_19th_May_Triangle_Classification_If_Else {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter side 1: ");
        int side1 = scanner.nextInt();

        System.out.println("Please Enter side 2: ");
        int side2 = scanner.nextInt();

        System.out.println("Please Enter side 3: ");
        int side3 = scanner.nextInt();

        if(side1 == side2 && side1 == side3) {
            System.out.println("It is an equilateral triangle");
        } else if (side1 == side2 || side1 == side3 || side2 == side3 ) {
            System.out.println("Isosceles Triangle");
        }
        else {
            System.out.println("Scalene Triangle");

        }

    }
}
