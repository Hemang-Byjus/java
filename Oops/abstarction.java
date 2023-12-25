package Oops;

abstract class animals{
    animals()
    {
        System.out.println("Animals constructor called");
    }
    abstract void runs();
}
class cat extends animals{
    void runs()
    {
        System.out.println("cat runs");
    }
}
public class abstarction {
    public static void main(String[] args) {
        animals c=new cat();
        c.runs();
    }
}
