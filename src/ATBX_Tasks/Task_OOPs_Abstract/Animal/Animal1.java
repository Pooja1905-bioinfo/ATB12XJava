package ATBX_Tasks.Task_OOPs_Abstract.Animal;

abstract class Animal1 {
    String type;

    abstract void makesSound();
    void eat(){
        System.out.println("Animal eats");
    }

}
