interface  computer
{ int age = 20;
     void code();

}

class Laptop implements computer

{ public void code()
    {
        System.out.println("something");
    }

}
class  desktop implements computer
{ public void code()
    {
    System.out.println("ghcgchyxy");
    }
}
class developer {
    public void devapp( computer obj)
    {
       obj.code();
    }
}

interface X 
{
    void aage();
}
interface Y extends X
{
     void print();

}
// class B implemets computer,X{


// }
public class intrface {
    public static void main( String[] args)
    {
         computer obj = new Laptop();
         computer obj1 = new desktop();
         developer obj3 = new developer( );

obj3.devapp( obj);
obj3.devapp( obj1);
 System.out.println(computer.age);
    }
    
}
