package ATBX_Tasks.Task_OOPs_Constructor.Car;

public class Car1_Details {
    public static void main(String[] args) {
        Car1 c1 = new Car1("Suzuki","WagnR", 678000l);
        Car1 c2 = new Car1("TATA MOTORS","Altroz", 989000l);
        Car1 c3 = new Car1("Hyundai","i10", 6789000l);

        c1.carDetails();
        c2.carDetails();
        c3.carDetails();
    }
}
