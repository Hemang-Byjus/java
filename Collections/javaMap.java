package Collections;

import java.util.*;
public class javaMap{
    public static void main(String[] args) {
        TreeMap<Integer,Integer> m=new TreeMap<>();
        m.put(1, 10);
        m.put(2,20);
        m.put(3, 30);
        System.out.println("All entries in map are as follows: ");
        for(Map.Entry<Integer,Integer> it:m.entrySet())
        {
           System.out.println(it.getKey()+" "+it.getValue());
        }
        System.out.println("Map Keys are as follows: ");
        for(Integer key:m.keySet()){
            System.out.println(key);
        }
        System.out.println("Values Respective to each key are as follows: ");
        for(Integer value:m.values()){
            System.out.println(value);
        }
        m.forEach((key,value)->{
            System.out.println("Key is "+key+" , value is "+value);
        });
        System.out.println("Iterating on map using iterator ");
        Iterator<Map.Entry<Integer,Integer>> it=m.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,Integer> i=it.next();
            System.out.println(i.getKey()+" "+i.getValue());
        }
        
    }
}