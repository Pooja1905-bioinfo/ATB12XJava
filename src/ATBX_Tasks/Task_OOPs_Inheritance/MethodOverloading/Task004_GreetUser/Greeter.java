package ATBX_Tasks.Task_OOPs_Inheritance.MethodOverloading.Task004_GreetUser;

public class Greeter {
    public static void main(String[] args) {
        Greeting g1 = new Greeting();
        Greeting g2 = new Greeting();

        g1.greet();
        g2.greet("Pooja");
    }
}

class Greeting{
    public void greet(){
        System.out.println("Hello!");
    }
    public void greet(String name){
        System.out.println("Hello " + name + "!");
    }
}
