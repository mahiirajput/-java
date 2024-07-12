
    public class sixteen_inheritence 
{
     public static void main(String [] args)
     {
    // calc ref = new calc();
    // inheritence_second ref2 = new inheritence_second();
   advcalc ref2 = new  advcalc();

    int r1 = ref2.add(7,5);
    int r2 = ref2.sub(7,5);
    double r3 = ref2.pow(47, 45);
    System.out.println(r1 + " " + r2 + " "+ r3);
}
    
}
class calc 
{
    public int add(int a , int b)
    {
        return a+b;
    }
    public int sub(int a , int b)
    
    {
        return a-b;
    }
}
