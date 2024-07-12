class revision
//hello world
{
    public static void main(String[] args)
    {
    System.out.println("hellow");

    //variable

System.out.println(5 + 8);
{
  int num = 4;
  int num2 = 6;
  System.out.println(num);
  System.out.println(num+num2);
   int res= num +num2;
  System.out.println(res);

  //datatypes
  
float num3 = 5.5f;
byte num4 = 124;
short num5 = 544;
long num6 = 5454l;
double num7 = 5.45;
char c ='k';
boolean num8=true;
 System.out.printf("float : %2f%n  byte :%d%n  short :%d%n long : %d%n  double : %f%n  charcater : %c%n  boolean :%b%n",num3 ,num4 ,num5 ,num6 ,num7,c ,num8);
 
//literals

//integer literls
int num9 =  0b1001;//binary
int num10 = 0x8B;//hexadecimal
int num11 = 100_00_00_00;
 System.out.printf("binary = %d%n  hexadecimal = %d%n %d", num9 , num10, num11);

 //float literals
 double num12= 12e10;
 System.out.println(num12);

 //character
 char A = 'a';
 A++;
 System.out.printf("%c%n",A);

 //type conversion
 
 byte num13 = 121;
 int num14 = 1878;
 //b = a not possible as b is byte and a is int
 num13= (byte)num14;
 System.out.println(num13); // explicit conversion 
  num14 = num13;
  System.out.println(num14); //implicit

  //operators

  // rational  operator
  int num15 =54;
  int num16 = 56;
  boolean result = num15 > num16;
  System.out.println(result); 

  boolean ans = num15==num16;
System.out.println(ans);

//logical operator 
int num17 = 57;
boolean res1 = num15<=num16&&num16<=num17;
boolean res2 = num15>=num16|| num16 <=num17;
System.out.println(res1);
System.out.println(res2);

//conditional operators
int num18 = 4;
if(num18>10 && num18<=50)
{
  System.out.printf("%d%n",num18);
}
else
{
  System.out.println("False");
  
}
 int num19 = 56;
 int num20 = 9;
 int num21 =4;
 if (num19> num21 && num19 <num20)
 {
  System.out.printf("%d%n",num19);
 } 
 else if(num20>num19&&num20>num21)
 {
  System.out.printf("%d%n",num20);
 }
 else{
  System.out.printf("%d%n",num21);
 }

 //ternary operator 
int num22 = 8;
int res3 = 0;
 res3 = num22%2== 0 ? 10 : 200;
 System.out.println(res3);
}
 }
}


