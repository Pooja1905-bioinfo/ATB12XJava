package ATBX_Tasks.Task_OOPs_Abstract.MultipleInheritance;

class Loan implements NewBank, OldBank{

    @Override
    public void Loan50k() {

    }

    @Override
    public void getInterestNew() {
        NewBank.super.getInterestNew();
    }

    @Override
    public void Loan1lac() {

    }

    @Override
    public void getInterestOld() {
        OldBank.super.getInterestOld();
    }
}

interface NewBank {
    void Loan50k();
    default void getInterestNew(){
        System.out.println("Interest rate is 7.0%");
    }

}

interface OldBank {
    void Loan1lac();
    default void getInterestOld(){
        System.out.println("Interest rate is 6.5%");
    }
}


