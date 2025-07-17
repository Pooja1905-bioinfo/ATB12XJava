package ATBX_Tasks.Task_OOPs_Polymorphism.MethodOverriding.Task001_AnimalSounds;

public class CowClass extends AnimalBase{
    @Override
    public void sound() {
        System.out.println("Moo");
    }
}
