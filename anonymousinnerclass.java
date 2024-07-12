class X 
{
    public void inner()
    {
        System.out.println("anonymous inner class");

    
    }
}
abstract class Bee {
    public  abstract void ant();
    public abstract void config();

    }


public class anonymousinnerclass 
{ public static void main(String[] args) 
    {
        X obj = new X()
        {
    
            
        public void inner()
        {
            System.out.println("anonymous inner class new");
    
        }
        };
        obj.inner();
        Bee obj1 = new Bee() 
        
            {
                public void ant()
                {
                    System.out.println("a class new");
                
                }
                public void config() {
                 
                    throw new UnsupportedOperationException("Unimplemented method 'config'");
                }
               };
               obj1.ant();     
}
  
}
