package Arrays;
public class arr {
    public static void change(int a[]){
        for(int i=0;i<3;i++)
        {
            a[i]++;
        }
    }
    public static void pass2d(int a[][])
    {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3};
        for(int i=0;i<3;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        change(a);
        for(int i=0;i<3;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println();
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
        pass2d(b);
    }
}
