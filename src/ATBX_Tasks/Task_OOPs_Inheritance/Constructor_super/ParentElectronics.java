package ATBX_Tasks.Task_OOPs_Inheritance.Constructor_super;

public class ParentElectronics {

    String brand;
    Long price;
    String category;
    String warranty;
    String serNo;

    public ParentElectronics(String brand, Long price, String category) {
        this.brand = brand;
        this.price = price;
        this.category = category;

    }

    public ParentElectronics() {
    }

    public void displayItemInfo(){
        System.out.println("Details of item: ");
        System.out.println("Brand: "+ brand);
        System.out.println("Category: "+ category);
        System.out.println("Serial Number: "+ serNo);
        System.out.println("Price: "+ price);
        System.out.println("Warranty period: "+ warranty);
    }


}
