class S extends Thread
{ public void run()
    {
        for(int i=0; i<=15;i++)
        {
            System.out.println("hellow");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
   
            e.printStackTrace();
        }
    }
    }
}
class U extends Thread
{ public void run()
    {
        for(int i=0; i<=15;i++)
        {
            System.out.println("hiiii");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
    }
}
public class threads 
{public static void main(String[] args) {
    S obj1 = new S();
    U obj2= new U();
    // System.out.println(obj1.getPriority());
    // obj2.setPriority(Thread.MAX_PRIORITY)
;    obj1.start();
try {
    Thread.sleep(2);
} catch (InterruptedException e) {
   
}
    obj2.start();
}
    
}
