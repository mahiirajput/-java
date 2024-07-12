import java.io.IOException;
// import java.io.InputStreamReader;
import java.util.Scanner;
// import java.io.BufferedReader;

public class input
 {
 public static void main(String[] args) throws IOException {
    {
        System.out.println("Enter A number");   
//        int num = System.in.read();// gives ascii value
//InputStreamReader in = new InputStreamReader(System.in);
//BufferedReader bf = new BufferedReader(in);
Scanner sc = new Scanner(System.in) ;
//int num = Integer.parseInt(bf.readLine());//
int num = sc.nextInt();
        System.out.println(num);
        //bf.close();//
        sc.close();
    }
 }
}
