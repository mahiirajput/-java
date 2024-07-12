 class mobile
 {
    String brand ;
     int price;
     static String name ;
     static 
     {
       name = " Smartphone";
       System.out.println("in static block");
     }
     public mobile ()
     {
        brand = " ";
        price  = 40000;
         System.out.println("in constructor block");

     }
     public void show ()
     {
        System.out.println( brand + " " + price  + " " + name + " ");
     }
}
public class tenth_nill 
{
   public static void main(String args [])  throws ClassNotFoundException
   {

      Class.forName( "mobile" ); // use to access any class in your file not usd oftnn
   //   mobile obj = new mobile();
   //   obj.brand ="apple";
   //   obj.price = 60000;
   //   mobile.name = "Smartphone";
   //   mobile obj1 = new mobile();

   }
}