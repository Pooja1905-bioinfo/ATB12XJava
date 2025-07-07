package ex27_Generics;

public class Lab226_Generics_Class {
    public static void main(String[] args) {
        GenericClass g1 = new GenericClass(10);
       // GenericClass g2= new GenericClass("Pooja");
    }
}

class GenericClass{
    private Integer data;
    public GenericClass(Integer data){
        this.data = data;
    }

    public Integer getData() {
        return data;
    }
}
