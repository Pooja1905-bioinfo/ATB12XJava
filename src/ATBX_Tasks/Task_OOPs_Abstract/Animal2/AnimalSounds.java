package ATBX_Tasks.Task_OOPs_Abstract.Animal2;

public class AnimalSounds{
    public static void main(String[] args) {
        Animal2 a2 = new Cow();
        a2.name = "Cow";
        //System.out.println(a2.name);
        a2.animalMakesSound();

    }

}
abstract class Animal2 {
    String name;


    public void AnimalSound(String name) {
        this.name = name;

    }

    abstract void animalMakesSound();

}

class Cow extends Animal2{
    void animalMakesSound(){
        System.out.println("Animal: " + super.name);
        System.out.println("Animal sounds: says: Moo!");
    }
}


