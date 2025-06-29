package ATBX_Tasks.Task_OOPs_Abstract.Concrete;

abstract class ParentClass {
    String name;
    Integer age;

    abstract void show();
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

}

}

class ChildClass extends ParentClass{

    @Override
    void show() {
        System.out.println("This is the example of abstract method");
    }
}