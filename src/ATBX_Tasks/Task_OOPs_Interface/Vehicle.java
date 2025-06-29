package ATBX_Tasks.Task_OOPs_Interface;

public interface Vehicle {
    default void start(){
        System.out.println("Vehicle Started");
    }

    static void fuelType(){
        System.out.println("Fuel Type is Petrol");
    }
}
