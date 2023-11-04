package Aniket;

public class Type80_multithreading_threadgroup implements Runnable
{
    public void run()
    {

        System.out.println(Thread.currentThread().getName()+" "+ Thread.currentThread().getPriority());
    }

    public static void main(String[] args)
    {
        Type80_multithreading_threadgroup obj80 = new Type80_multithreading_threadgroup();
        ThreadGroup tg = new ThreadGroup("Parent Thread group");

        Thread t1 = new Thread(tg,obj80,"One");
        t1.start();
        Thread t2 = new Thread(tg,obj80,"Two");
        t2.start();
        Thread t3 = new Thread(tg,obj80,"Three");
        t3.start();

        System.out.println("Thread group name: "+tg.getName());
        System.out.println("Active Threads: "+ tg.activeCount());
        tg.setMaxPriority(10);
    }
}
