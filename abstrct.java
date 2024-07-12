abstract class Carss
{
   public abstract void drive();
   public void van()
   {
    System.out.println("drive");
   }
}  

class Gwagon extends Carss
{
public void drive()
{
    System.out.println("in abstract method object is accesed from inherited class ");
}
public void fly()
{
    System.out.println("flying");
}
}

public class abstrct
{
 public static void main(String[] args) 
 { Gwagon obj = new Gwagon();
    obj.drive();
    obj.fly();  
 }
}
