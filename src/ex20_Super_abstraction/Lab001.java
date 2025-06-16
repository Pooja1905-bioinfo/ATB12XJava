package ex20_Super_abstraction;

public class Lab001 {
    public static void main(String[] args) {
        car c1 = new car(100);
        c1.display();
    }

}
class vehicle{
    public int speed = 180;

    void noTest(){
        System.out.println("Empty");
    }

    vehicle(){
        System.out.println("Default contructor");
    }

    vehicle(int a){
        System.out.println("Param contructor");
    }

    void message(){
        System.out.println("PC - argument");
    }

    void display(){
        System.out.println("Parent ");
    }
}

class car extends vehicle{
    private int speed = 280;


    car(){
        super(100);
    }

    car(int a){
        System.out.println("PC car");
    }

    void display(){
        System.out.println("New display");
        System.out.println(super.speed);
        System.out.println(this.speed);
        //System.out.println(super.noTest);

    }

}
