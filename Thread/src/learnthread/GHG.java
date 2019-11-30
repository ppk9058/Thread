package learnthread;

import java.util.concurrent.locks.Lock;

class GHG 
{ 
    public static void main (String[] args) 
    { 
  
        // creating two threads 
        DemoJoin t1 = new DemoJoin(); 
        DemoJoin t2 = new DemoJoin(); 
        DemoJoin t3 = new DemoJoin(); 
  
        // thread t1 starts 
        t1.start(); 
        System.out.println(t1.getPriority());

        // starts second thread after when 
        // first thread t1 has died. 
        try
        { 
        	Thread.currentThread().setPriority(10);
            System.out.println("Current Thread: "
                  + Thread.currentThread().getName());
         
            System.out.println(t1.getPriority());

            //t1.join(); 
        } 
  
        catch(Exception ex) 
        { 
            System.out.println("Exception has " + 
                                "been caught" + ex); 
        } 
  
        // t2 starts 
        t2.start(); 
        System.out.println(t1.getPriority());

        // starts t3 after when thread t2 has died. 
        try
        { 
            System.out.println("Current Thread: "
                 + Thread.currentThread().getName()); 
            //t2.join(); 
        } 
  
        catch(Exception ex) 
        { 
            System.out.println("Exception has been" + 
                                    " caught" + ex); 
        } 
  
        t3.start(); 
        System.out.println(t1.getPriority());

    } 
} 