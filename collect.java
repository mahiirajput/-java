//import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
//import javax.xml.transform.Source;
public class collect 
{ 
    public static void main(String A[])
{
    List<Integer> nums = new ArrayList<Integer>();
    nums.add(9);
    nums.add(8);
    nums.add(4);
    nums.add(5);
      //System.out.println(nums.indexOf(2));
      //System.out.println(nums.get(2));
      for(int n : nums)
      {
        
        System.out.println(n);
      }
}    
}
