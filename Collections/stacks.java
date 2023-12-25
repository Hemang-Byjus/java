package Collections;

import java.util.Stack;

public class stacks {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(10);
        System.out.println(s);
        System.out.println("Top element of stack is "+s.peek());
        s.push(12);
        System.out.println(s);
        s.pop();
        s.pop();
        System.out.println(s);
    }
}
