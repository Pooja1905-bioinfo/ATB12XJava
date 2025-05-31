package ex08_ATBX_JAVA_Switch_Statements;

import java.util.Scanner;

public class Lab004_Real_Usage_Automation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Browser: ");
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Starting the Chrome");
                System.out.println("...........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "edge":
                System.out.println("Executed the code");
                break;
            case "firefox":
                System.out.println("Starting the firefox");
                break;
            default:
                System.out.println("I am not aware about this");;
                break;
        }
    }
}
