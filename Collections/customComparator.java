package Collections;

import java.util.*;

public class customComparator {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        Integer n=sc.nextInt();
        Integer m=sc.nextInt();
        ArrayList<ArrayList<Integer>> a=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            ArrayList<Integer> b=new ArrayList<>(m);
            for(int j=0;j<m;j++){
                Integer q=sc.nextInt();
                b.add(q);
            }
            a.add(b);
        }
        System.out.println("Elemets of the list are as follows: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a.get(i).get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(a);
    }
}

// {2,2,2,2}
// 4+2+1+1=>8
// {2,2,2,2,2}
// 5+ 
// 1
// 3
// 3+2+1
