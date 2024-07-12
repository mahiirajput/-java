public class wrapper {
    public static void main(String[] args)
    {
int num = 90;
// Integer num1= new Integer(90); //(boxing)
Integer num1= num; //auto-boxing
System.out.println(num1);
// int num3= num1.intValue();
int num3= num1; //auto-unboxing

System.out.println(num3);
String str = "sanjana";
int num4 = Integer.parseInt(str);
System.out.println(num4*3);
    }
}
