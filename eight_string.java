 class eight_string
{
 public static void main(String args[])
   {
    //String 
     String  obj = new String("navin");
          {
                 obj =  "navin"+"  "+ "sudama";
                System.out.printf("%s%n",obj);
                System.out.println(obj.hashCode());
                System.out.println("hello"+ " "+obj); //concationation
                System.out.println(obj.charAt(2));
          }
       String name = "sana";
        {
            System.out.println(name);
        }
        String Sanjana = "sana";
        {
          {
            System.out.println(Sanjana);
            System.out.println(Sanjana.hashCode());
            System.out.println(name.hashCode());

          }
        }
        // String buffer 
        StringBuffer sb = new StringBuffer("Deepak ");  // creating obj 
        System.out.println(sb.capacity()); // capacity of string buffer
        sb.append(" Prajapati");// add at end
        System.out.println(sb);
        sb.deleteCharAt(2);  // deletiom at a particular index
        System.out.println(sb);
        sb.insert(0, Sanjana +" " ); // insertion at a particular index
        System.out.println(sb);
      

        sb.ensureCapacity(100);
        System.out.println(sb.capacity());

        //String builder  is same as string buffer 



   }   
}
