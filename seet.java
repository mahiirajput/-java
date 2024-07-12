import java.util.Set;
// import java.util.ArrayList;
// import java.util.List;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;

 public class seet{
    public static void main(String A[])
    {
        Set<Integer> nums = new HashSet <Integer>();
        nums.add(910);
        nums.add(737);
        nums.add(524);
        nums.add(914 );
        for(int n: nums){
            System.out.println(n);

        }
        Set <Integer> num = new TreeSet<Integer>();
        num.add(90);
        num.add(77);
        num.add(54);
        num.add(94 );
        for(int i : num){
            System.out.println(i);
        }
  Iterator<Integer> value = nums.iterator(); 
  while(value.hasNext())
  System.out.println(value.next());
    }
 }