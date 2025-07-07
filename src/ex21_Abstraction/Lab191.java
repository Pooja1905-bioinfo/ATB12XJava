package ex21_Abstraction;

public class Lab191 {
}

class New implements Pooja{

    @Override
    public void display() {
        System.out.println(a);
    }
}

interface Pooja{
    int a = 10;
    void display();
 }