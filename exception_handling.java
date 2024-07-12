public class exception_handling {
    public static void main(String a []){
        int i =0;
        i=20;
        int j=0;
        int[] nums = new int[5];
        

        // String str= null;
        try{
            j=18/i;
            if(j==0)
            {
                throw new ArithmeticException("i dont want to print 0");
            }
            // System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);

        }
        catch(ArithmeticException e)
{
    System.out.println("cann't divide by zero ");
}
catch(ArrayIndexOutOfBoundsException e)
{
    System.out.println("out of limit");
}
catch(Exception e)
{
    System.out.println("do something"+e);
}
System.out.println(j);
System.out.println("byee");
    }
    
}
