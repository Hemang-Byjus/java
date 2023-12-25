package Arrays;

public class passByReference {
    public static void swap(Integer a,Integer b)
    {
        Integer temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[] args) {
        Integer a=10,b=20;
        System.out.println(a+" "+b);
        swap(a, b);
        System.out.println(a+" "+b);
    }
}
