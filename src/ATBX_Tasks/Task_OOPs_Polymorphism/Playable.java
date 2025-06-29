package ATBX_Tasks.Task_OOPs_Polymorphism;

public interface Playable {
   void play();
}

class Piano implements Playable{
    @Override
    public void play(){
        System.out.println("Playing Piano");
    }

}

class guitar implements Playable{
    @Override
    public void play(){
        System.out.println("Playing Guitar");
    }

}
