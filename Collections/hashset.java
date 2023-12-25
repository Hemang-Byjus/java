package Collections;
import java.util.*;
public class hashset { 
    public static void main(String[] args) {
        // same as set in c++
        // elements will be in sorted oreder
        HashSet<Integer> s=new HashSet<>();
        s.add(10);
        s.add(8);
        s.add(12);
        System.out.println(s);
        if(s.contains(12)){
            s.remove(12);
        }
        System.out.println(s);
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.clear();
        System.out.println(s);
    }
}
