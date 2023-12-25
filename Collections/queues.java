package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class queues {
    public static void main(String[] args) {
        // Queue<Integer> q=new LinkedList<>();
        Queue<Integer> q=new LinkedList<>() ;
        q.offer(12);
        q.offer(10);
        System.out.println(q);
        System.out.println("Front element of q is "+q.peek());
        q.poll();
        System.out.println(q);
    }
}


