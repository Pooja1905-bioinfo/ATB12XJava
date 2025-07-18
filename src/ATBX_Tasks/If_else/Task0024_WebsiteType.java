package ATBX_Tasks.If_else;

import java.util.Scanner;

public class Task0024_WebsiteType {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the URL: ");
        String str = scanner.next();

        if(str.contains(".com")){
            System.out.println("The website type is: Commercial website");
        }
        else if(str.contains(".org")){
            System.out.println("The website type is: Non-profit organization");
        }
        else if(str.contains(".edu")){
            System.out.println("The website type is: Educational institution");
        }
        else if(str.contains(".gov")){
            System.out.println("The website type is: Government website");
        }
        else if(str.contains(".net")){
            System.out.println("The website type is: Network-related website");
        }
        else if(str.contains(".info")){
            System.out.println("The website type is: Informational website");
        }
        else if(str.contains(".xyz")){
            System.out.println("The website type is: Unknown or other types of websites");
        }

    }
}
