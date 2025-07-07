package ex21_Abstraction;

public class Lab186_AC {
    public static void main(String[] args) {
        WagonR car = new WagonR();
        car.drive();
        car.startEngine();
        car.stopEngine();

    }

}
class WagonR extends Engine implements Tyre,Gear {
        void drive(){
            rubberTyre();
            blackColour();
            startEngine();
            changeGear();
            stopEngine();

        }
        @Override
        void startEngine() {
            System.out.println("Starting");
        }

    @Override
    public void changeGear() {

    }

    @Override
    public void rubberTyre() {

    }

    @Override
    public void blackColour() {

    }
}

    abstract class Engine{
        abstract void startEngine();
        void stopEngine(){
            System.out.println("Stop");
        }
    }
interface Tyre{
    void rubberTyre();
    void blackColour();
    default void burnTyre(){

    }
    static void m1(){}
}

interface Gear{
    void changeGear();
}

