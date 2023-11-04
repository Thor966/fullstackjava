package Aniket;

public class Type73_multithreading_interrupt extends Thread
{
    public void run()
    {
        System.out.println("I am ready for interview");

        for(int i=1;i<=5;i++)
        {
            System.out.println("This is my "+i+" interview");
        }

        try
        {
            System.out.println("I got placed! i want to relax");
            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            System.out.println("My sleep got disturb");
        }

        System.out.println("Time to go to office");
    }

    public static void main(String[] args)
    {
        Type73_multithreading_interrupt obj = new Type73_multithreading_interrupt();
        Thread t1 = new Thread(obj);
        t1.start();
        t1.interrupt();

    }
}
