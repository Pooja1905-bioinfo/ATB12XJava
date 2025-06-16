package ex19_OOPS_Polymorphism.overriding;

public class Lab002_MOriding {
    public static void main(String[] args) {
        Daughter d1= new Daughter();
        d1.home();
        d1.swift();
        d1.f1();

        Father f1 = new Father();
        f1.home();
        f1.f1();
        //f1.swift();

        Father f2 = new Daughter();
        f2.home();
    }
}
