 class third_loop {
    public static void main(String[] Args)
    {   
        //while loop  
    int k = 1;
    int j = 1;
    
    while(k<=4)
    {
       System.out.println("hello"  +k);
        //int j = 1;
        while( j<=4)
         {
            System.out.println( "catenation"+j);
            j++;
         }
       k++;
    }
    //System.out.println("bye"+k);
    //do while loop
   int i = 7;
   do
    {
       System.out.println("hello"  +i);
       i++;
    }
       while(i<=4);
//for loop
 for (i=2 ; i <4;i++)
 {
    System.out.println("kemcho");
 }
 int day =1;
int hour = 0;
 for (day=1;day<=7;day++)
 {

    System.out.printf("%d%n day=",hour);
    
     for(hour=1 ; hour <=day; hour++)
     {
      hour = 24*day;
      // System.out.printf("%d%n hour=",day);

     }
     System.out.printf("%d%n hour=",day);

}
   
     
    }
}