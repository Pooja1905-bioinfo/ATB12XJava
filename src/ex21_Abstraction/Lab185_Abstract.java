package ex21_Abstraction;

public class Lab185_Abstract {
    public static void main(String[] args) {
        son s1 = new son();
        s1.loan50k();
    }
    class normal{
        //concrete class= complete class
    }
    abstract static class father {
        abstract void loan50k();
    }
    static class son extends father{
        @Override
        void loan50k(){
            System.out.println("Loan given");
        }
    }

}
