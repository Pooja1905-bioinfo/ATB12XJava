package ATBX_Tasks.Task_OOPs_Polymorphism;

public class InterfacePolymorphism {
    public static void main(String[] args) {
        Playable p1 = new guitar();
        Playable p2 = new Piano();

        p1.play();
        p2.play();
    }
}
