import java.util.*;
public class QueuePractice {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.offer("Hello");
        q.offer("to");
        q.add("DS");
        q.add("Class");

        System.out.println("Print queue = "+q);
        System.out.println("Head of queue = "+q.peek());
        System.out.println("Size = "+q.size());
        
        Queue<String> q2 = new PriorityQueue<>();

        q2.offer("Hello");
        q2.offer("to");
        q2.add("DS");
        q2.add("Class");

        System.out.println("Print pqueue = "+q2);
        System.out.println("Head of pqueue = "+q2.peek());
        System.out.println("Size pqueue = "+q2.size());
    }
}
