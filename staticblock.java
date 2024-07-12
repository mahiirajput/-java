  class mobile 
 {
   String brand ;
   int price ;
   static String name ; 

   static 
   {
  name = "Smart phone ";
  System.out.println("in static block");
   }
   public mobile () 
   {
     brand = "xyz";
     price = 50000000;
       System.out.println("in constructor");
   }
   
    public  void  show( )
    { 
          System.out.println(brand + " " +price + " " + name );

    }
   

 }
 class staticblock
{
    public static void main (String args[])
    {
       mobile obj = new mobile();

       obj.brand = "Apple";
       obj.price = 4000000;
     mobile.name ="Smartphone";
    //  mobile obj1 = new mobile();
    }
    
}
