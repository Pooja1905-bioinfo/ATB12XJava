package ATBX_Tasks.Task_OOPs_Inheritance.Constructor_super;

public class DisplayDetails {
    public static void main(String[] args) {
        MobileChild i1 = new MobileChild("Samsung",35000L,"Mobile","5G",128, "8MP & 25MP");
        TelevisionChild i2 = new TelevisionChild("1280*800", "Netflix");

        i1.displayMobile();
        i2.displayTelevision();
    }
}
