package ATBX_Tasks;

import java.util.Scanner;

public class Task6_19th_May_Triangle_Classification_Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter side 1: ");
        int side1 = scanner.nextInt();
        System.out.println("Please Enter side 2: ");
        int side2 = scanner.nextInt();
        System.out.println("Please Enter side 3: ");
        int side3 = scanner.nextInt();

        String result = (side1 == side2 && side1 == side3)? "It is an equilateral triangle" : (side1 == side2 || side1 == side3 || side2 == side3)? "Isosceles Triangle" : "Scalene Triangle";
        System.out.println(result);
    }
}
