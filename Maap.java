 import java.util.Map;
import java.util.HashMap;
 public class Maap 
 {
    public static void main(String a[]){
        Map<String , Integer> students = new HashMap<>();
        students.put
        ("Harsh", 90);
        students.put ("arsh", 94);
       System.out.println(students);
       System.out.println(students.keySet());
      for(  String key: students.keySet())
      {
        System.out.println(key + ":"+ students.get(key));
      }
    }
}
 