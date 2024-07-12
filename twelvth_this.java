class insaan 
{
    private int Age ;
     private String name ;
    public int  getAge( )
    {
        return Age;
    }
    public String getname()
    {
        return name;
    }
   public void setname( String n)
   {
     name =n;
   }
   public void setAge(int Age  )
   {  
    this.Age = Age;
   }

} 
 public class twelvth_this 
{
    public static void main(String[] args) 

    {
    insaan obj = new insaan();
    //  System.out.println(obj.getname () + ":"+ obj.getAge());

    obj.setAge(70 );
    obj.setname( "Reddy");
  System.out.println(obj.getname () + ":"+ obj.getAge());

    }
}