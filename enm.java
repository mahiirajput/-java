 enum Status
 { 
     running, Failed,Pending,Success;
 }
 enum Laptop{
    macbook(44000), Lenovo(4545), asus(5545), hp(5656);
    private int price;

    private Laptop(int price) {
        this.price = price;
    }
    public int getprice()
{
    return price;
}
public void setprice( int price)
{
    this.price=price;
}
    
 }
    public class enm
 {
     public static void main(String A[])
      {

    //   Status s = Status.running;
// System.out.println(s.ordinal()); 
// int i=5;
Status[] ss= Status.values();  
for(Status s : ss)
{
    System.out.println(s);  
     }
     Status s = Status.Pending ;
     System.out.println(s.getClass().getSuperclass());
     
//      switch(s)
//   {
//      case running :
//         System.out.println(" alll good");
//         break;
//         case Pending: 
//         System.out.println("just wait");
//        break;
     
//   }
     if(s==Status.running)
     {
        System.out.println("good");
     }

    else if(s==Status.Pending)
    {

        System.out.println("please wait");
    }
    else if(s == Status.Failed)
    {
        System.out.println("try again");
    }
  
    Laptop lap = Laptop.macbook;
    System.out.println(lap.getprice());
    for(Laptop lap1 : Laptop.values())
    {   System.out.println(lap1.getprice());
 
    }
}
 }