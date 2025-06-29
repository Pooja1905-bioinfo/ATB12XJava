package ATBX_Tasks.Task_OOPs_Constructor.Mobile;

public class Mobile_Details {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Realme");
        Mobile m2 = new Mobile("OnePLus", 780000);
        Mobile m3 = new Mobile("Samsung", 750000);

        m1.displayInfo();
        m2.displayInfo();
        m3.displayInfo();

    }
}
