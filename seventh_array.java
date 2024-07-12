  class seventh_array 
 { public static void main(String[] A)
    {
        int num[]={4,7,5,2};
         num[1]=6;
        System.out.println(num[1]);

        int num1[]= new int[4];
        num1[0]=4;
        num1[1]=44;
        num1[2]=45;
        num1[3]=42;
     for (int i = 0; i <4;i++)
      {
         System.out.printf("%d%n",num1[i]);
      }

     //multi dimensional array
      
     int num2[][]= new int[4][4];
     
    for (int i =0; i<4; i++)
    {
        for (int j = 0; j<4; j++)
        {
           num2[i][j] = (int)( Math.random()*10);

           System.out.print(num2[i][j]+" ");
        }
      System.out.println(" ");
    }
   
    //3-D array
    int num3[][][] = new int[3][4][2];
    for(int i =0; i<3;i++)
    {
        for(int j=0;j<4;j++)
        {
          for (int k=0;k<2;k++)
          {
            num3 [i][j][k]= (int)( Math.random()*10);
            System.out.print(num3[i][j][k] + " " +" ");

                }
        }
        System.out.println(" ");
    }

// jagged Array
int num4[][]= new int[3][];

 num4 [0] = new int [4];
 num4 [1] = new int [2];
 num4 [2] = new int [3];
 for(int i = 0 ; i <num4.length; i++)
 {
     for(int j=0; j<num4 [i].length; j++)
    {
       num4 [i][j]= (int)(Math.random());
       System.out.print(num4 [i][j]+" ");
    }
 System.out.println(" ");
 }
          

     
    }
    
    
}
// Array of object

class extra {
    int var = 10;
    public float trying( float dec1, float dec2)
    {
        dec1= 6.5f;
        dec2= 5.6f;
        return dec1+dec2;
    }
}
//array of objects in java
 class Student
 {
    String name;
    int rollno;
    int marks;
}
class none
{
    public static void main(String[] args)
    {
      Student s1= new Student();
      s1.name ="navu";
      s1.rollno = 7;
      s1.marks = 75;
      Student s2 = new Student();
      s2.name ="diwa";
      s2.rollno = 6;
      s2.marks = 56;
      Student s3 = new Student();
      s3.name ="sana";
      s3.rollno = 5;
      s3.marks = 96;
      Student student[] = new Student[3];
      student[0]=s1;
      student[1]=s2;
      student[2]=s3;
      // for(int i = 0 ; i<student.length;i++)
      // {
      //   System.out.println( student[i].name +" "+student[i].rollno +" "+student[i].marks );
      // }
      for(Student nums : student)
      {
         System.out.println(nums.rollno + " " + nums.name + " ");
      }
    }
}

    

