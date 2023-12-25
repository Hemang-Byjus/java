package Collections;

import java.util.*;


public class javaSet {
    public static void main(String[] args) {
        TreeSet<Integer> s=new TreeSet<>(Comparator.reverseOrder());
        s.add(10);
        s.add(2);
        s.add(23);
        for(Integer it:s){
            System.out.println(it);
        }
        System.out.println("printing elements using iterator");
        Iterator<Integer> it=s.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("printing elements using for-each");
        s.forEach(element->{
           System.out.println("element is : "+element); 
        });
    }
}
