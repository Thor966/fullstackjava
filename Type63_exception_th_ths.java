package Aniket;

import java.io.FileReader;
import java.util.Scanner;

public class Type63_exception_th_ths
{
    int avl_amt =1000;
    void meth1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int wd_amt  =sc.nextInt();
        if(avl_amt<wd_amt)
        {
            throw new ArithmeticException("Insufficient Funds " );
        }
        else
        {
            System.out.println("Transaction Successful!: ");
            System.out.println("Your Money is: "+wd_amt);
            System.out.println("Please collect your Cash ");

        }

    }
    void meth2() throws Exception
    {
        FileReader fr = new FileReader("C:\\Users\\Aniket\\OneDrive\\Desktop"); //
        System.out.println("meth2() called ");
    }

    public static void main(String[] args) throws Exception
     {
         Type63_exception_th_ths obj = new Type63_exception_th_ths();
         obj.meth1();
         obj.meth2();
    }
}
