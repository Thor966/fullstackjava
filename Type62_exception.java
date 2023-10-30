package Aniket;

import java.util.Scanner;
public class Type62_exception
{
    void meth1()
    {
        Scanner sc = new Scanner(System.in);
        String s[] = new String[5];
        System.out.println(10);
        try
        {
            System.out.println("try block is executed ");
            System.out.println(20/sc.nextInt());
            System.out.println("====>"+s[2].length());
        }
        catch(NullPointerException e)
        {
            System.out.println("catch block is executed ");
            e.printStackTrace();

        }
        finally
        {
            System.out.println("Finally block always executed ");
        }

        System.out.println(30);
    }
    public static void main(String[] args)
    {
        new Type62_exception().meth1();
    }
}
