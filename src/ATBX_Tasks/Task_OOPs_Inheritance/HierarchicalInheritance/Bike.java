package ATBX_Tasks.Task_OOPs_Inheritance.HierarchicalInheritance;

public class Bike extends Vehicle1{
    Integer seats = 2;
    String ACpresent = "No";
    String Bootspace = "No";

    public void bikeDetails(){
        System.out.println("Bike Details");
        displayVehiclInfo();

        System.out.println("Seating Capacity: " + seats);
        System.out.println("AC present: " + ACpresent);
        System.out.println("Is bootspace is there: " + Bootspace);
        System.out.println("________________________________");
    }

}
