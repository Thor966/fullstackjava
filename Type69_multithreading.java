package Aniket;

public class Type69_multithreading extends Thread
{
    public void run()
    {
        System.out.println(" I am a Aniket");
    }

    public static void main(String[] args)
    {
        Type69_multithreading obj = new Type69_multithreading();
        Thread th1 = new Thread(obj);
        th1.start();
    }
}
