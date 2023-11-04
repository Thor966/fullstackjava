package Aniket;

public class Type76_multithreading_synchronization  extends Thread
{
    /*
     synchronized block
     synchronized block is  always in run() method
    */

    public void run()
    {
       String name  = Thread.currentThread().getName();
        System.out.println(name+" is executing ");
        synchronized (this)
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println(name+" is value is: "+i);
            }
        }

        System.out.println(name+" is executed");
    }

    public static void main(String[] args)
    {
        Type76_multithreading_synchronization obj = new Type76_multithreading_synchronization();

         Thread t1 = new Thread(obj);
         Thread t2 = new Thread(obj);

         t1.setName("First-Thread");
         t2.setName("Second-Thread");

         t1.start();
         t2.start();
    }
}
