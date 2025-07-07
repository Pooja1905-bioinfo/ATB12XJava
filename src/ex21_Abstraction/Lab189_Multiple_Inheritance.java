package ex21_Abstraction;

public class Lab189_Multiple_Inheritance {
}
class child1 implements father1,mother{
    @Override
    public void money(){
        System.out.println("money from child");
    }

    @Override
    public void alto() {
        System.out.println("money from child");

    }

    @Override
    public void f1() {
        System.out.println("money from child");

    }

    @Override
    public void df() {
        father1.super.df();
    }
}

interface father1{
    void money();
    void f1();

    default void df(){
        System.out.println("m1");
    }
}

interface mother{
    void money();
    void alto();
}
