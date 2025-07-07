package ex27_Generics;

public class Lab227_GenericClass {
    public static void main(String[] args) {
        GenericClass2 g21 = new GenericClass2<>(10);
        GenericClass2 g22 = new GenericClass2<>("Pooja");
        GenericClass2 g23 = new GenericClass2<>(6.5);
    }
}

class GenericClass2<T>{
    private T data;

    public GenericClass2(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
