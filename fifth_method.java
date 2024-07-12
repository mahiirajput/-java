class fifth_method 
{ 
    // int cost;/
    public static void main(String args [] )
    {
        alright ref = new alright();
          String str = ref.stationary(2);
          ref.music();

        System.out.printf("%s",str);
    }

    
}

class alright 
{
    public String stationary (int cost)
    {  if (cost>=10)
        {
        return "pen";
        }
        else 
        {
            return "no bro who got you smiling like that";
        }
    }

    public void music()
    {
        System.out.println("bal vridh nar nari sab behal sakhiya ");
    }

}
