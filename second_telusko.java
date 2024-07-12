class second_telusko
{
public static void main(String[] args)
 {// releationship operator

    int x= 23;
    int y = 45;
    boolean result = x >y;
System.out.println(result);
int z= 7;
int w= 8; 
boolean result1 = z==w;
System.out.println(result1);

//logical operator

 boolean result2 = x>y|| z<w;
    System.out.println(result2);

    boolean result3 = x>y&& z<w;
    System.out.println(result3);

    //loops
    int a =33;
    if(a>30)
    {
        System.out.println("yess");
    }
    else
{
    System.out.println("no");
}
// ternary operator ?:
//int num_4 = 5;

//switch case
int num = 8;
switch(num){
    case 1:
     System.out.println("Monday");
     break;
     case 2:
     System.out.println("tuesday");
     break;
     case 3:
     System.out.println("wednesday");
     break;
     case 4:
     System.out.println("thursday");
     break;
     case 5:
     System.out.println("friday");
     break;
     case 6:
     System.out.println("Saturday");
     break;
     case 7:
     System.out.println("Sunday");
     break;
     default:
     System.out.println("not right input");
    //  String day = "Monday";
    //  switch(day)
    //  {
    //     case "Saturday","Sunday"-> System.out.println("6:00am");
    //     case "Monday"->System.out.println("9:00am");
    //     default->System.out.println("7:00am");
         String day = "Monday";
         String dayout = "";
     dayout = switch(day)
  {
     case "Saturday","Sunday"-> "6:00am";
     case "Monday"-> "9:00am";
     default-> "7:00am";
     };
     System.out.println(dayout);
}


}
}