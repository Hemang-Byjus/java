import java.util.*;
public class QueueWorking {
    public static void main(String[] args) {
        // Queue<Integer> q=new LinkedList<>();
        // Minheap 
        PriorityQueue<Integer> q=new PriorityQueue<>();
        q.add(7);
        q.add(10);
        q.add(4);
        // Iterator it=q.iterator();
        // while(it.hasNext()){
        //     System.out.print(it.next()+" ");
        // }
        // System.out.println();
        // System.out.println("Minheap elements are: "+q);
        while(!q.isEmpty()){
            System.out.println("Top Elements is: "+q.remove());
        }
        // q.poll();
        // System.out.println(q);
        // System.out.println(q.peek());

        // Maxheap

        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        maxheap.add(10);
        maxheap.add(4);
        maxheap.add(7);
        System.out.println("Maheap is: "+maxheap);
        while (!maxheap.isEmpty()) {
            System.out.println("Top elements of maxheap is: "+maxheap.remove());
        }
        
    }
}




