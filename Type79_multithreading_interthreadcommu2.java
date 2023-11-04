package Aniket;

public class Type79_multithreading_interthreadcommu2
{
    public static void main(String[] args)
    {
        Type78_multithreading_interthreadcommu1 obj78 = new Type78_multithreading_interthreadcommu1();

        new Thread() // first thread
        {
            @Override
            public void run()
            {
                try
                {
                    obj78.with_draw(65000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
        .start();

        new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    obj78.deposite(90000);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
        .start();
    }
}
