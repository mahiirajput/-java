class M
{
    public void method()
    {
 System.out.println ("FINAL KEYWORD");
    }
}
final class G extends M 
{
  
    
       final  public void method()
        {
              System.out.println ("FINAL KEYWORD");
        }
    
    
}
public class twenty_final 
{
     public static void main(String[] args) {
        
         final int x = 10;
        // x=4;
        System.out.printf("%d\n",x);
        G obj = new G();
        obj.method();
     }
}
