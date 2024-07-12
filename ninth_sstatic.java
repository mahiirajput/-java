
class mobile {
    String model;
    String name;
    int cost;
     static String type ;
    public void print ()
    {
        System.out.printf(" model =  %s%n name   = %s %n cost  =%d%n  type = %s%n" , model , name , cost, type);

    }
  public static void print1 (mobile m)
  {
     System.out.println(" model : " + m.model + " " + " name : " +  m.name + "  " + " cost : " +   m.cost +  "  " +" type : " +  type +" : "  );

  }
}


public class ninth_sstatic 
{
     public static void main (String args[])
     {
         mobile m1 = new mobile();
           m1.model = "apple";
           m1.name = "iphone";
           m1.cost = 23_00_00;
           mobile.type = "Smartphone";

 
           
           mobile m2 = new mobile();
           m2.model = "Samsung";
           m2.name = "galaxy S20";
           m2.cost = 23_00_00_00;
           mobile.type = "Smartphone";

           mobile.type = "Phone";
          m1.print();
          m2.print();
          mobile.print1(m1);
     }
}
 