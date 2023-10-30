package Aniket;
import java.util.Scanner;
public class Type61_exception
{
    void meth1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(10);
        try
        {
            System.out.println("Try block executed");
            System.out.println("Enter the number ");
            System.out.println("====>"+20/sc.nextInt());
        }
        catch(ArithmeticException a)
        {
            System.out.println("Catch block executed");
            //System.out.println(a.getMessage()); // its print only the reason of exception
            //System.out.println(a.toString()); // its print name and the reason of the exception
           a.printStackTrace(); // these method print all info about the exception

        }
        finally
        {
            System.out.println("Finally block is executed");

        }

        System.out.println(30);
    }
    public static void main(String[] args)
    {
        new Type61_exception().meth1();
    }
}
