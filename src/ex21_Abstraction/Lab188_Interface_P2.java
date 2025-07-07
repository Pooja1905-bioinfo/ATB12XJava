package ex21_Abstraction;

public class Lab188_Interface_P2 {
}

class P implements I1,I2{

    @Override
    public void icm3() {

    }

    @Override
    public void icm4() {

    }

    @Override
    public void icm1() {

    }

    @Override
    public void icm2() {

    }
}

interface I1{
    void icm1();
    void icm2();
}

interface I2{
    void icm3();
    void icm4();
}