package ATBX_Tasks.Task_OOPs_Inheritance.Constructor_super;

public class MobileChild extends ParentElectronics {

    String simSupported;
    Integer storage;            // in GB
    String camResolution;

    public MobileChild(String brand, Long price, String category, String simSupported, Integer storage, String camResolution) {
        super(brand, price, category);
        this.simSupported = simSupported;
        this.storage = storage;
        this.camResolution = camResolution;
    }

    public void displayMobile(){
        displayItemInfo();
        System.out.println("simSupported: " + simSupported);
        System.out.println("Internal Storage in GB: " + storage);
        System.out.println("Front and Back camera: " + camResolution);
        System.out.println("********************************");
        System.out.println("Brand: "+ brand);
    }

}
