public record innerclass() {
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.show();
        A.B obj1= obj.new B();
        obj1.tell();
// A.B obj1 = new A.B()   // for static class  
    }
}
class A
{  int age;
    public void  show ()
    {
        System.err.println("the out");
    }  
    class B
    {
    public void tell()
 {
 System.out.println("tell");
 }
//   static class B
//  {
//  public void tell()
// {
// System.out.println("tell");
// }
    }
}