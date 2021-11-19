import java.util.concurrent.ThreadFactory;

public class thred {
    ThreadFactory a,b;
    Thread a()
    {
        System.out.println("hello");
        return null;
    }
   Thread b()
   {
       System.out.println("imnob");
       return null;
   }
    public static void main(String[] args) {
        thred a= new thred();
         a.a();
         a.b();
        
    }
    
}
