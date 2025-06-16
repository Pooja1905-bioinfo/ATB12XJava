package ex17_OOPs_Constructors;

public class Lab002_OOPs_Constructor {

    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1);

    }
}

class A{
    A(){
        System.out.println("Open the CSV file");
        System.out.println("Open the page");
    }
}
