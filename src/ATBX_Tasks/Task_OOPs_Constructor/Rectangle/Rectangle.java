package ATBX_Tasks.Task_OOPs_Constructor.Rectangle;

public class Rectangle {
    Float length;
    Float breadth;

    public Rectangle(Float length, Float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area(){
        Float rectangleArea = length*breadth;
        System.out.println("Area of Reactangle: " + rectangleArea);
        System.out.println("******************");
    }

}
