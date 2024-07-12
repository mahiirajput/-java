class A {
    public void show()
    {
        
    System.out.println("in A");

    }
}
class B extends  A
{
    public void show()
    {
        
    System.out.println("in B");

    }
}
public class nineteen_dynamic_polymorphism
 { 
    public static void main( String[] args)
    {
     A obj1 = new B();
     obj1.show();
    // A obj = new A();
    // obj.show();
    // obj= new B();
    // obj.show();
    }
 }

    


