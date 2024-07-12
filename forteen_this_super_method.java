public class forteen_this_super_method
{
    public static void main(String [] Args)
    {
    //  B ref =new B(56);
// System.out.println(B.ref);
    }
}

class A extends Object 
 { 
    public A()
    {
        super();

        System.out.println("in A ");
    }
    public A(int c )
    {
        super();
        System.out.println("int A");
    }
 }
// class B extends A  //calling only specified constructor of B
// {  
//     public B ()
    
    
//     {
//         super( );
//         System.out.println("in B ");
//     }
//     public B (int n )
//     {
//         super(n);
//         System.out.println("int B ");
//     }

// }
class B extends A // calling all constructor of B
{
    public B()
    {
        super();
        System.out.println("in B");

    }
  public B (int n)
    {
    this(); // this method execute the constructor of same class
    System.out.println("int B");

    }
 }