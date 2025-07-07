package ex28_Collection_Framework.Queue;

import java.util.PriorityQueue;

public class Lab243_Queue {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.add("Pooja");
        q.add("Sanjay");
        q.add("Rajani");
        q.add("Shreepad");
        q.add("Dutta");

        System.out.println(q);

        System.out.println(q.peek());
        System.out.println(q.poll());

        System.out.println(q);
    }
}
