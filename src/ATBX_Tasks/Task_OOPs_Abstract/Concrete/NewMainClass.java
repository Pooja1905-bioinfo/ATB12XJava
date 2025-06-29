package ATBX_Tasks.Task_OOPs_Abstract.Concrete;

public class NewMainClass {
    public static void main(String[] args) {
        ParentClass p1 = new ParentClass() {
            @Override
            void show() {

            }
        };
        p1.show();
        p1.display();
    }
}
