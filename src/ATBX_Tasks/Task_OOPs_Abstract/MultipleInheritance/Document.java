package ATBX_Tasks.Task_OOPs_Abstract.MultipleInheritance;

public class Document implements Showable, Printable{

    @Override
    public void print() {
        System.out.println("Print the Document");

    }

    @Override
    public void show() {
        System.out.println("Show the Document");

    }
}
