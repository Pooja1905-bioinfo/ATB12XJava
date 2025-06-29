package ATBX_Tasks.Task_OOPs_Abstract.Bank;

public class BankDetails {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        b1.getInterest();
        b2.getInterest();
    }
}
