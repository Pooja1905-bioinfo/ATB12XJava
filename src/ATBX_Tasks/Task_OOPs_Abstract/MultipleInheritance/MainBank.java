package ATBX_Tasks.Task_OOPs_Abstract.MultipleInheritance;

public class MainBank {
    public static void main(String[] args) {
        Loan l1 = new Loan();
        l1.getInterestOld();
        l1.getInterestNew();
        l1.Loan50k();
        l1.Loan1lac();
    }
}
