package ex28_Collection_Framework;

import java.util.Stack;

public class Lab238_Stack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(1);
        s.push(4);

        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s);
    }
}
