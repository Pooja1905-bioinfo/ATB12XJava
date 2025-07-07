package ATBX_Tasks.If_else;

import java.util.Scanner;

public class Task0013_ValidTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print the side 1: ");
        int side1 = scanner.nextInt();
        System.out.println("Print the side 2: ");
        int side2 = scanner.nextInt();
        System.out.println("Print the side 3: ");
        int side3 = scanner.nextInt();

        if(((side1 + side2) > side3 && (side1 +side3) > side2) && (side2 + side3) > side1 ){
            System.out.println("It is valid triangle");
        }

        else{
            System.out.println("Triangle is not Valid");
        }

    }
}
