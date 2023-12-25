import java.util.*;
public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> s=new TreeSet<>(Collections.reverseOrder());
        s.add(20);
        s.add(30);
        s.add(10);
        System.out.println(s);
        
        // Iterator it=s.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
        // Set<Integer> s1=new TreeSet<>();
        // s1.add(20);
        // s1.add(30);
        // s1.add(10);
        // System.out.println(s1);
        // it=s1.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
        // s1.remove(10);
        // System.out.println(s1);
    }
}
