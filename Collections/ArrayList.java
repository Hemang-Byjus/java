package Collections;

import java.util.*;

class Arrays{
    public static void main(String[] args) {
       List<Integer> a=new ArrayList<>();
       a.add(1);
       a.add(2);
       a.add(3);
       a.add(4);
       System.out.println(a);
       a.add(2,20);
       System.out.println(a);
       System.out.println(a.get(3));

       for(Integer i:a){
            System.out.print(i+" ");
       }
       System.out.println();
       for(int i=0;i<a.size();i++){
        System.out.print(a.get(i)+" ");
       }
       System.out.println();
       Iterator<Integer> it=a.iterator();
       while(it.hasNext()){
            System.out.print(it.next()+" ");
       }
       System.out.println();
    }
}