package ATBX_Tasks.Task_OOPs_Inheritance.Constructor_super;

public class TelevisionChild extends ParentElectronics {
    String screenSize;
    Boolean isAndroid;
    String smartFeatures;

    public TelevisionChild(String screenSize, String smartFeatures) {
        this.screenSize = screenSize;
        this.smartFeatures = smartFeatures;
    }

    public void displayTelevision(){
        displayItemInfo();
        System.out.println("Screen size in inches: " + screenSize);
        System.out.println("Android features: " + isAndroid);
        System.out.println("What are the Smart features : " + smartFeatures);
        System.out.println("****************************");
    }
}
