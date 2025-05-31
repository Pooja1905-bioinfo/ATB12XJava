package ex10_ATBX_While_loop;

import java.util.Random;
import java.util.Scanner;

public class Lab006_Guessing_Game {
    public static void main(String[] args) {
        Random random = new Random();
        int guess_number = random.nextInt(100) + 1;
        //System.out.println(guess_number);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int guess;
        int attempt = 0;


        while (true) {
            if(!scanner.hasNext()){
                System.out.println("Invalid Input! Please enter a number: ");
                scanner.next();
                continue;
            }
            guess  = scanner.nextInt();
            if(guess < 1 || guess > 100){
                System.out.println("Please Enter a number between 1 to 100: ");
                continue;
            }
            attempt++;
            if (guess > guess_number) {
            System.out.println("Too high, try again");}
            else if (guess < guess_number) {
            System.out.println("Too low, try again");}
            else{
                System.out.println("Correct! You have guessed in " + attempt + " attempt");
                break;
            }


        }
    }}
