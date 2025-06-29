package ATBX_Tasks.Task_OOPs_Inheritance.HierarchicalInheritance;

import ATBX_Tasks.Task_OOPs_Constructor.Car.Car1;

public class Vehicleinformation {
    public static void main(String[] args) {
        Vehicle1 v1 = new CarVehicle();
        CarVehicle v2 = new CarVehicle();
        Bike v3 = new Bike();
        Bike v4 = new Bike();
        Vehicle1 v5 = new Bike();

        v1.displayVehiclInfo();
        v5.displayVehiclInfo();
        v2.ShowCarDetails();
        v3.bikeDetails();
        v4.bikeDetails();


    }
}
