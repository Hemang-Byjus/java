package Collections;
import java.util.*;
public class treeSet {
    public static void main(String[] args) {
        // time complexity to add,delete,find an element in treeset is : O(logn)
        // whereas time complexity of all these operations in hashset is: O(1)
        TreeSet<Integer> s=new TreeSet<>();
        s.add(12);
        s.add(20);
        s.add(5);
        System.out.println(s);
        System.out.println(s.size());
        
    }
}
