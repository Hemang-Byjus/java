package Collections;

import java.util.ArrayDeque;

public class deques {
    public static void main(String[] args) {
        ArrayDeque<Integer> q=new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offerFirst(1); // add element to begin
        System.out.println(q);
        System.out.println(q.peekFirst());// front element
        System.out.println(q.peekLast());// last element
        q.pollFirst();// remove first element
        q.pollLast();// remove last element
        System.out.println(q);
    }
}
