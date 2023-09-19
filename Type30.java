package Aniket;

import java.sql.SQLOutput;

// control statements.
// selection statements, if
public class Type30
{
    void meth1(int a)
    {
        System.out.println("****meth1() called****");
        if(a<=10)
        {
            System.out.println("if block is executed");
        }
        System.out.println("java is awesome");
        System.out.println("meth1() execution complete"+"\n");
    }

    void meth2(int i)
    {
        System.out.println("**** meth2() called****");
        if(i<=20)
            System.out.println("if block is executed");
        System.out.println("java is awesome");
        System.out.println("meth2() execution complete"+"\n");
    }

    int meth3(int i)
    {
        System.out.println("****meth3() callled****");
        if(i<=10)
            return 100;
            return 140;
    }

    void meth4(int a)
    {
        System.out.println("meth4() called");
        if(true)
        {
            System.out.println("If block executed");
        }

        System.out.println("java is awesome");
        System.out.println("meth4() execution complete"+"\n");
    }
    int meth5()
    {
        System.out.println("meth5() called");
        return 1;
    }

    int meth6()
    {
        System.out.println("meth6() called"+"\n");
        return 99;
    }

    int meth7(int x , int y)
    {
        System.out.println("meth7() called");
        System.out.println(x);
        System.out.println(y);
        return 500;
    }
    void meth8(int i)
    {
        System.out.println("meth8() called");
        System.out.println("value of i: "+i);

        Type30 obj = new Type30();
        if(i<= obj.meth7(obj.meth6(),obj.meth5()))
        {
            System.out.println("if block executed");
        }
        else
        {
            System.out.println("else block executed");
        }
        System.out.println("Java is awesome");
        System.out.println("meth8() execution complete"+"\n");
    }

    void meth9(int a)
    {
        System.out.println("meth9() executed");
        if(a<=20)
            //int x =10; // compile time error
            System.out.println("if block executed");

        else
           // int y = 20; // compile time error
            System.out.println("else block executed");

        System.out.println("Java is awesome");
        System.out.println("meth9() execution complete"+"\n");
    }

    void meth10(int i)
    {
        System.out.println("meth10() called");
        if(i>0)
        {
            System.out.println(i+ "is a Positive number");

            if(i%2==0)
            {
                System.out.println(i+"is a even number");
            }
            else
            {
                System.out.println(i+ "is a odd number");
            }
        }
        else if(i<0)
        {
            System.out.println(i+ "is Negative number");
        }
        else
        {
            System.out.println(i+"is equal to zero");
        }

        System.out.println("Java is awesome");
        System.out.println("meth10() execution complete"+"\n");
    }

    public static void main(String[] args)
    {
        System.out.println("main method called");

           Type30 obj2 = new Type30();

           obj2.meth1(100/5);
           obj2.meth2(100);
        System.out.println(obj2.meth3('A'-'B' + 5));
        obj2.meth4(1000);
        obj2.meth8('A'*2/2);
        obj2.meth9(50);
        obj2.meth10(-1);
        
    }
}
