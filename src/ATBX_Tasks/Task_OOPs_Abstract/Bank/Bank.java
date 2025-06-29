package ATBX_Tasks.Task_OOPs_Abstract.Bank;

abstract class Bank {

    abstract void getInterest();
    /*{

        System.out.println("HDFC Interest rate: 7.0%");
    }*/
}

class SBI extends Bank{

    void getInterest(){
        System.out.println("SBI Interest rate: 6.5%");
    }

}

class HDFC extends Bank{
    void getInterest(){
        System.out.println("HDFC Interest rate: 7.0%");
    }
}
