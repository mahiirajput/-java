
  class first_hello
{
    public static void main(String args[])
{ 
    int num1 =3;
    int num2 = 56;
    int result =num1+num2;
    System.out.println(result);
    System.out.println(3+8);
    System.out.println("hello world");
   // variable

    double marks =78.5;
    /*System.out.printf("the number is =%4f",marks);
    int num =545;
    boolean  b =true;
    float f = 54.5f;
    char c ='d';
    byte be = 54;
    short sh =90;
    long lo = 4545455l;*/
    System.out.printf("the number is =%4f",marks );
    //literals
   
     int nb = 0b10101 ;
     int num3 = 0x7F ;
     int num4 = 10_00_00_0;
    System.out.printf("the number is = %d\n%d%d\n=",nb, num3, num4);

  // type casting//
  
   System.out.println("TYPE CASTING");
    byte k =101;
    int ac = 45;
    ac=k;

    int aa =195;
    byte ba = (byte)aa;

    System.out.printf("%d\n%d\n",ba,ac);
    float ze3 =5.7f;
    int x = (int)ze3;
     System.out.printf("%d",x);

     //TYPE PROMOTION

     byte az=10;
     byte cy =30;
     int result1 = cy*az;
     System.out.println(result1);
     
     
      

    


}
} 
