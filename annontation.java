@FunctionalInterface  // used with interface
interface func
 {
    void aim();
 }
 
 class HH
 {
  public void display()
  {
    System.out.println(",,,,,");
  }
}

class BB extends HH
{
    @Override
    public void display()
    {
      System.out.println(",,,,,");
    }
}
public class annontation {
    public static void main(String a[])
    {
        BB ob = new BB();
        ob.display();

    }

    
}
