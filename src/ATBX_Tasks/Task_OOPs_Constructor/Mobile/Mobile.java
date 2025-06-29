package ATBX_Tasks.Task_OOPs_Constructor.Mobile;

public class Mobile {
    String brand;
    Integer price;

    public Mobile(String brand) {
        this.brand = brand;
    }

    public Mobile(String brand, Integer price) {
        this.brand = brand;
        this.price = price;
    }

    public void displayInfo(){
        System.out.println("Mobile Details: ");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("__________________________");
    }

}
