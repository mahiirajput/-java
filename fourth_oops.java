class calc
{
    int a; // variable

    public int add ( int n1 , int n2) //method (add - method name)
    {
         int r = n1+n2; 
        return r ;
    }
}

class fourth_oops
{
    public static void main(String[] A)
    {
        int num = 9 ;
        int num1 = 10;
         
       calc ref = new calc();
        int result = ref.add(num, num1);

        System.out.printf("%d%n",result);
        extra obj = new extra();

       float res1= obj.trying(5.6f,7.8f);

        System.out.printf("%f",res1);

        
    }

}
