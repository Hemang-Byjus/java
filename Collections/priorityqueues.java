package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueues {
    public static void main(String[] args) {
        // minheap
        System.out.println("Minheap : ");
        Queue<Integer> pq=new PriorityQueue<>();
        pq.offer(10);
        pq.offer(12);
        pq.offer(8);
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq);

        // maxheap
        System.out.println("Maxheap: ");
        Queue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());
        q.offer(10);
        q.offer(12);
        q.offer(8);
        System.out.println(q);
        System.out.println(q.peek());
        q.poll();
        System.out.println(q);
    }
}
