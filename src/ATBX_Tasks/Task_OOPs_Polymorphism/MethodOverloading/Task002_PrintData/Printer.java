package ATBX_Tasks.Task_OOPs_Polymorphism.MethodOverloading.Task002_PrintData;

public class Printer {
    public static void main(String[] args) {
        Printing p1 = new Printing();
        Printing p2 = new Printing();
        Printing p3 = new Printing();

        p1.printData(55);
        p2.printData("Pooja");
        p3.printData(5.5f);
    }
}

class Printing{
    public void printData(String data){
        System.out.println("String data: " + data);
    }

    public void printData(int data){
        System.out.println("Integer data: " + data);
    }

    public void printData(float data){
        System.out.println("Float data: " + data);
    }
}
