public class inheritence_second extends calc
{
    public int multiply( int c , int d )
    {
             return c*d;
    }
     public int divide( int c , int d )
    {
             return c/d;
    }
}
 
 class advcalc extends inheritence_second
{
    public double pow( int a , int b)
     {
          return Math.pow(a, b);
    }

}
