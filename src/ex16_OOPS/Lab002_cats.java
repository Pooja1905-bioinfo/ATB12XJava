package ex16_OOPS;

public class Lab002_cats {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = null;
        new Cat();
        c1.running();
        c2.running(); //Java null pointer exception
    }
    static class Cat{
        String name;


        void running(){
            System.out.println("Running");
        }

    }
}
