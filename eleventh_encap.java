class human {
    private int age ;
    private String name ;
    public int getAge()
    {
        // age = 40;
        return age;
    }
    public void setAge (int a)
    {
        age = a;

    }
    public String getName () //for fetching 
    { 
    //    name = "Navin";
       return name;
    }
    public void setName(String n)// for setting
    {
        name = n;
    }
}
public class eleventh_encap 
{
    public static void main(String arggs[])
    { 
        human obj = new human();
        obj.setAge(90);
        obj.setName("reddy");
        System.out.println(obj.getName( ) + " : " + obj.getAge());
        // System.out.println(obj.setName(  ) + " : " + obj.setAge( ));
                

    }
}
