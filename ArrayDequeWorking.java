import java.util.*;;
public class ArrayDequeWorking {
    public static void main(String[] args) {
        ArrayDeque<Integer> q=new ArrayDeque<>();
        q.add(10);
        q.offerLast(20);
        q.offerFirst(30);
        System.out.println(q);
        System.out.println(q.pollLast());
        System.out.println(q.pollFirst());
        q.addFirst(200);
        q.addLast(300);
        
    }
}
