import java.util.*;

public class LearnComparator {
    public static void main(String[] args) {
        // Comparator<Integer> comp=new Comparator<Integer>() {
        //     public int compare(Integer a,Integer b){
        //         if(a<b){
        //             return 1;
        //         }
        //         else{
        //             return -1;
        //         }
        //     }
        // };
        // List<Integer> a=new ArrayList<>();
        // a.add(10);
        // a.add(8);
        // a.add(12);
        // a.add(4);
        // Collections.sort(a,comp);
        // System.out.println(a);
        Comparator<int[]> comp1=new Comparator<int[]>() {
            public int compare(int[] a,int[] b){
                if(a[0]>b[0]){
                    return 1;
                }
                else if(a[0]==b[0]){
                    if(a[1]<b[1]){
                        return 1;
                    }
                    else return -1;
                }
                else return -1;
            }
        };
        int [][]a=new int[4][2];
        a[0][0]=5;
        a[0][1]=2;
        a[1][0]=2;
        a[1][1]=4;
        a[2][0]=2;
        a[2][1]=3;
        a[3][0]=3;
        a[3][1]=4;
        // Arrays.sort(a,(i,j)->Integer.compare(i[0], j[0]));
        Arrays.sort(a,comp1);
        for(int i=0;i<4;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
// {5,2}{2,4}{2,3}{3,4}
