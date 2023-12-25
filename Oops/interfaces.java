package Oops;
interface animal{
    void eats();
    void runs();
}
interface streetAnimals{
    void eats();
    void runs();
}
class dog implements animal,streetAnimals{
    public void eats()
    {
        System.out.println("Dog Eats");
    }
    public void runs(){
        System.out.println("Dog runs");
    }
}
public class interfaces {
    public static void main(String[] args) {
        streetAnimals a=new dog();
        a.eats();
        a.runs();
    }
}
// Interfaces define method signatures without specifying the method bodies. All methods in an interface are implicitly public and abstract
// when you are defining the methods in the class which implements the interface then it should be declared starting with public keyword.
