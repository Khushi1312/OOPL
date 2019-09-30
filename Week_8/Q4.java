import java.util.*;
import static java.lang.System.*;
class Q4 extends Thread 
{ 
    public void run() 
    { 
        out.println("Inside run method"); 
    } 
  
    public static void main(String[]args) 
    { 
        Q4 t0 = new Q4(); 
        out.println("t0 thread priority : " +t0.getPriority());
        out.println("Main thread priority : "+ Thread.currentThread().getPriority()); 
        Thread.currentThread().setPriority(2); 
        out.println("Main thread priority : "+ Thread.currentThread().getPriority()); 
        Q4 t1 = new Q4(); 
        Q4 t2 = new Q4(); 
        out.println("t1 thread priority : " +t1.getPriority());
        out.println("t2 thread priority : " +t2.getPriority());
        t1.setPriority(6); 
        t2.setPriority(5); 
        try{
          t2.setPriority(21);
        }
        catch(Exception e)
        {
          out.println(e);  
        } 
        t2.setPriority(7);
        out.println("t1 thread priority : " +t1.getPriority()); 
        out.println("t2 thread priority : " +t2.getPriority());  
    } 
}
