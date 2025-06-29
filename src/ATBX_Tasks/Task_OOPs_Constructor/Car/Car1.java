package ATBX_Tasks.Task_OOPs_Constructor.Car;

public class Car1 {
    String brand;
    String model;
    Long price;

    public Car1(String brand, String model, Long price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void carDetails(){
        System.out.println("Car Details");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);

        System.out.println("***************");

    }
}
