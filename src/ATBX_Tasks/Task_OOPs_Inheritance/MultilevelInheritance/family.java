package ATBX_Tasks.Task_OOPs_Inheritance.MultilevelInheritance;

public class family {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.money = "1 lac";
        c1.gold = "10 gram";
        c1.home();
        c1.farm();

        GrandParent1 c2 = new Child();
        c2.farm();

        Parent1 p1 = new Parent1();
        p1.farm();
        p1.home();

        GrandParent1 p2 = new Parent1();
        p2.home();

        System.out.println(c1.money);

    }
}
