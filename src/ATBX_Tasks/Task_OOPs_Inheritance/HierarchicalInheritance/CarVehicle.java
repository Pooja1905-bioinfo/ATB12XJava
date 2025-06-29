package ATBX_Tasks.Task_OOPs_Inheritance.HierarchicalInheritance;

public class CarVehicle extends Vehicle1 {
    Integer seats = 4;
    String ACpresent = "Yes";
    String Bootspace = "Yes";

    public void ShowCarDetails(){
        System.out.println("Car Details");
        displayVehiclInfo();

        System.out.println("Seating Capacity: " + seats);
        System.out.println("AC present: " + ACpresent);
        System.out.println("Is bootspace is there: " + Bootspace);
        System.out.println("***********************");
    }
}
