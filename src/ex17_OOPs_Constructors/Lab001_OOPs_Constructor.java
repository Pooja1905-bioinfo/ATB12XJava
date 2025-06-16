package ex17_OOPs_Constructors;

public class Lab001_OOPs_Constructor {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        Baby b2 = new Baby();
        Baby b3 = new Baby();


    }


}

class Baby{

    Baby() {
        System.out.println("I am called");
        // called automaticallly
    }

    String name;



}
