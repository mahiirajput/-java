 class A
{
public int add( int n1 ,int n2)
{
      return n1+n2;
}
// public void config()
// { 
//       System.out.println("in A config");

// }
}
class B extends A
{
 public  int add ( int n1, int n2)
 {
      return n1+n2+2;
 }
}

public class method_overriding 
{
     public static void main ( String A[])
     {
      B obj = new B();
      // obj.config();
     int r1 =  obj.add(4 , 3 );
     System.out.println(r1); 
     }
}

