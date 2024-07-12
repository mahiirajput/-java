 @FunctionalInterface
 interface aim{
    void print(int i);
 }
@FunctionalInterface
 interface red
 {
    int aim1(int i, int j);
 }
 public class lambdaexpression 
 {
    public static void main(String[] args) {
        aim obj =(i)-> System.out.println("next" +i);
        obj.print(6);

red obj1 = (i,j)-> i+j;
int result = obj1.aim1(6,7);
 System.out.println(result);
    }  
}
