package Aniket;
/*
In deadlock it is the pattern of accessing the resources A and B, is the main issue.
To solve the issue we will have to simply re-order the statements
 where the code is accessing shared resources.
 */
public class Type77_multithreading_deadlock
{

    public static void main(String[] args)
    {
        final String A = "Aniket";
        final String B = "Kunal";

        Thread t1 = new Thread()
        { // Anonymous inner class
            public void run()
            {
                synchronized (A)  // Thread1 will be holding for A (Aniket)
                {
                    {
                        System.out.println("Thread 1 locked on A");
                    }

                    try
                    {
                        Thread.sleep(100);
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                    }

                    synchronized (B) // Thread1 will be waiting for B (Kunal)
                    {
                        System.out.println("Thread 1 locked on B");
                    }
                }

                System.out.println("no dead lock");
            }
        } // Anonymous inner class ends here
        ;

        Thread t2 = new Thread()
        {
            public void run()
            {
                synchronized (B)// Thread2 will be holding a B(Kunal)
                {
                    {
                        System.out.println("Thread2 locked on A");
                    }

                    try
                    {
                        Thread.sleep(100);
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                    }

                    synchronized (A) //Thread2 will be waiting for A (Aniket)
                    {
                        System.out.println("Thread2 locked on A");
                    }

                }

                System.out.println("no deadlock");

            }
        }
         ;
        t1.start();
        t2.start();
    }
}
