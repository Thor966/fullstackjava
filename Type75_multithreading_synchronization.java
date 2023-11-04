package Aniket;

public class Type75_multithreading_synchronization extends Thread
{
    // synchronization method
    public void run()
    {
        criticalResources();
    }

    public synchronized void criticalResources()
    {
        String name = Thread.currentThread().getName();
        System.out.println(name+" is executing criticalResources() ");

        for(int i=1;i<=5;i++)
        {
            System.out.println(name+" i value is: "+i);
        }

        System.out.println(name+" completed execution");
    }

    public static void main(String[] args)
    {
        Type75_multithreading_synchronization obj = new Type75_multithreading_synchronization();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.setName("First-Thread");
        t2.setName("Second-Thread");

        t1.start();
        t2.start();
    }
}
