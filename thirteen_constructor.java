class insaan 
{
    private int Age ;
     private String name ;
     
     public insaan() //  default constructor
     {
       System.out.println( "in constructor");
      Age = 12;
      name = "babu";
     }
     
     public insaan(String name)
    {
        this.name = name;
    }

    public insaan ( int a , String name) // parameterized constructor  
     {
      Age = a;
      this.name = name;
     }
    public int  getAge( )
    {
        return Age;
    }
    public String getname()
    {
        return name;
    }
   public void setname( String name)
   {
     this.name =name;
   }
   public void setAge(int Age  )
   {  
    this.Age = Age;
   }

} 
 public class thirteen_constructor
{
    public static void main(String args [] ) 

    {
    insaan obj = new insaan();
      insaan obj1 = new insaan(67,"baby");
     System.out.println(obj.getname() + ":"+ obj.getAge());
     
     System.out.println(obj1.getname() + ":"+ obj1.getAge());


    obj.setAge(70 );
    obj.setname( "Reddy");
//   System.out.println(obj.getname () + ":"+ obj.getAge());

    }
}