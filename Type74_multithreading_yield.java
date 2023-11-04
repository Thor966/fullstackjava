package Aniket;


class ClassB extends Thread
{
  public void run()
  {
      for(int i=1;i<=5;i++)
      {
          System.out.println("ClassB "+i);
          Thread.yield();
      }
  }
}
public class Type74_multithreading_yield
{
    public static void main(String[] args)
    {
        ClassB obj = new ClassB();
        obj.start();



        for(int i=1;i<=5;i++)
        {
            System.out.println("Main() "+i);
        }
    }

    /*
    yield() method is used to pause current thread and execute another thread
     */


}
