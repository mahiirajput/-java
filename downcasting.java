public class downcasting {
    public static void main(String[] args){
    up obj = new down();
    obj.upcasting();
    down obj1 = (down) obj;
    obj1.downcaste();
}
    
}

class up
{
  public void upcasting()
  {
    System.out.println("upcaste");
  }
  
}
class down extends up
{
    public void downcaste()
    {
      System.out.println("downcaste");
    } 
}