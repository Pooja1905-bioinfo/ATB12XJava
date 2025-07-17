package ATBX_Tasks.Task_OOPs_Inheritance.MethodOverriding.Task002_VehicleStart;

public class MainVehicle {
    public static void main(String[] args) {
        BaseVehicle car = new CarVehicle();
        BaseVehicle bike = new BikeVehicle();

        car.start();
        bike.start();
    }
}
