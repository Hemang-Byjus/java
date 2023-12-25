package Collections;
import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> m=new HashMap<>();
        m.put(10, 10);
        m.put(1, 8);
        m.put(2, 12);
        System.out.println(m);
        // Iterator<Integer,Integer> it=m.iterator();
        for(Map.Entry<Integer,Integer> i:m.entrySet())
        {
            System.out.print(i.getKey()+" ");
            System.out.println(i.getValue());
        }
        if(m.containsKey(2)){
            m.remove(2);
            System.out.println("Present");
        }
        System.out.println(m.isEmpty());
        System.out.println(m.size());
        m.clear();
        System.out.println(m.size());
    }
}
