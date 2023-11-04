package Aniket;


class ClassA extends Thread
{
    public void run()
    {
     for(int i=1;i<=5;i++)
     {
         System.out.println("ClassA: "+i);
     }
    }

}
public class Type71_multithreading_join
{
    public static void main(String[] args) throws InterruptedException
    {
        ClassA obj = new ClassA();
        obj.start();
        obj.join();
        /*
        join() method allows the current executing thread to wait for the compilation of another thread
         */


        for(int i=1;i<=5;i++)
        {
            System.out.println("main(): "+i);
        }
    }
}
