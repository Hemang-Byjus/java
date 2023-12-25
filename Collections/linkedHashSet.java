package Collections;
import java.util.*;
public class linkedHashSet{
    public static void main(String[] args) {
        // in the linked hashset the order in which the elements are added remains the same
        Set<Integer> s=new LinkedHashSet<>(0);
        s.add(12);
        s.add(10);
        s.add(14);
        System.out.println(s);
    }
}