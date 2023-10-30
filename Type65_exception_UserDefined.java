package Aniket;

import java.util.Scanner;

public class Type65_exception_UserDefined
{
    static double current_balanced = 100;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdrawal");
        int n = sc.nextInt();

        try
        {
           if(current_balanced<n)
           {
               throw new Type64_exception_MinimumAccount_Balance("Insufficient funds! Your current balanced is :"+current_balanced);
           }
           else
           {
               System.out.println("Please take the money: "+n);
           }
        }
        catch (Type64_exception_MinimumAccount_Balance e)
        {
            e.printStackTrace();
        }

    }
}
