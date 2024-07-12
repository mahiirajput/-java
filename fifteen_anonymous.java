class C 
{
public C()
{
 System.out.println("in constructor C ");
}

public void show()
{
 System.out.println("in method ");
}
}

// normal object creaation 

// public class fifteen_anonymous 
// { 
//     public static void main(String[] args)
//     {C ref = new C();//object creation 
//    ref.show();
//     }
//  }
 
// object creation 
public class fifteen_anonymous
 {
 public static void main (String [] Args)
 {
     new C(); // anonymous  object 
     new C().show(); //calling method for anaonymous object 

    // C ref ; // reference creation
    //  ref = new C(); // obj creation 
    // ref.show();
 }
}

 
