package ex28_Collection_Framework;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab237_ArrayList_UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        String continueInput = "Y";
        while(continueInput.equalsIgnoreCase("Y")){
            System.out.println("Enter the name: ");
            String name = scanner.next();
            names.add(name);
            scanner.nextLine();
            System.out.println("Do you want more items?");
            continueInput = scanner.nextLine();
        }

        for(String name: names){
            System.out.println(name);
        }


    }
}
