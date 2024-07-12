import java.rmi.server.SocketSecurityException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream {
    public static void main(String A[])
    {
        // List<Integer> ny = new  Arrays.asList(5,7,8,9,7);
        List<Integer> ny = Arrays.asList(5, 7, 8, 9, 7);
         Stream<Integer> s1=  ny.stream();
         Stream<Integer> s2 = s1.filter(n -> n%2 ==0);
         s2.forEach(System.out.println(n));
    }
}
