package Aniket;
/*
Interthread communication means two thread communicate with each other by using wait(),notify(),notifyAll() methods
these is known as Interthread communication.
 */
public class Type78_multithreading_interthreadcommu1
{
    int amount =10000; // 90000+10000=100000
    synchronized void with_draw(int amount) throws Exception
    {
        if(this.amount<amount) // 10000<70000
        {
            System.out.println("Insufficient Balance ");

              wait();
            // Thread.sleep(5000);
            /*
            sleep() method is a getting incosistant result
             */


            System.out.println("Amount Credited ");
            this.amount -= amount;
            System.out.println("Transaction is successful \n Balance is: "+this.amount);
        }

        else
        {
            this.amount -= amount;
            System.out.println("With draw \n Balanced is: "+ this.amount);
        }
    }

    synchronized void deposite(int amount) //90000
    {
        this.amount +=amount;
        System.out.println("Deposited Successful \n Balanced is: "+ this.amount);
        notify();
        //notifyAll();
    }
}
