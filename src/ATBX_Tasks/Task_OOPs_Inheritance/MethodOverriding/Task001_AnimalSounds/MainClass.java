package ATBX_Tasks.Task_OOPs_Inheritance.MethodOverriding.Task001_AnimalSounds;

public class MainClass {
    public static void main(String[] args) {
        AnimalBase cat = new CatClass();
        AnimalBase dog = new DogClass();
        AnimalBase cow = new CowClass();

        dog.sound();
        cat.sound();
        cow.sound();

    }



}
