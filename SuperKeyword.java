import java.util.LinkedList;
import java.util.Queue;

class A{
    A(){
       System.out.println("Calling a"); 
    }
    void work(){
        System.out.println("A is working");
    }
}
class B extends A{
    B(){
        System.out.println("Calling b");
    }
}
class C extends B{
    C(){
        // super();
        System.out.println("Calling c");
    }
    void work(){
        super.work();
        System.out.println("C is working");
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        A obj=new C();
        obj.work();
       
    }
}
