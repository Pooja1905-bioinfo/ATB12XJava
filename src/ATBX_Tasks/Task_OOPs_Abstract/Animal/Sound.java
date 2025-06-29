package ATBX_Tasks.Task_OOPs_Abstract.Animal;

public class Sound {
    public static void main(String[] args) {
        Animal1 a1 = new Cat1();
        Animal1 a2 = new Dog1();

        a1.makesSound();
        a2.makesSound();
    }
}
