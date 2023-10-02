package Aniket;

// Iteration Statements (for loop)

import org.w3c.dom.ls.LSOutput;

public class Type34
{
    void meth1()
    {
        System.out.println("-------meth1()--------");
        for(int i=1;i<=5;i++)
        {
            System.out.println("i value "+i);
        }
        System.out.println("meth1() executed");
    }

    void meth2()
    {
        System.out.println("-------meth2()--------");
        for(int i=1;i<=5;i++)
        {
            System.out.println("i value "+ ++i + i);
        }
        System.out.println("meth2() executed");
    }

    void meth3()
    {
        System.out.println("-------meth3()--------");
        for(int i=1;i<=5;++i)
        {
            System.out.println("i value "+ ++i + i);
        }
        System.out.println("meth3() executed");
    }

    void meth4()
    {
        System.out.println("-------meth4()--------");
       int i=1;
        for(;;) // In the place of condition compiler put the by default true
        {
            System.out.println("i value "+i++);
        }
        //System.out.println("meth4() executed"); // this code is unreachable code
    }

    void meth5()
    {
        System.out.println("-------meth5()--------");
        int i =1;
        for(System.out.print("-----meth5()"),System.out.print("-------"); i<=5;i++)
        {
            System.out.println("i value "+i);
        }
        System.out.println("meth5() executed");
    }

    int meth6()
    {
        System.out.println("-------meth6()--------");
        return 1;
    }
    void meth7()
    {
        System.out.println("------------");
    }

    void meth8()
    {
        System.out.println("-------meth8()--------");
        for(int i=new Type34().meth6();i<=5;new Type34().meth7())
        {
            System.out.println("i value "+i++);
        }
        System.out.println("meth8() executed");
    }

    void meth9()
    {
        System.out.println("-------meth9()--------");
        int i=1;
        int j=5;
        for(;i<=5;i++,j--)
        {
            System.out.println("i value "+i++ + j--);
        }
        System.out.println("meth9() executed");
    }

    void meth10()
    {
        System.out.println("-------meth10()--------");
        int i=1;
        for(;;)
        {
            System.out.println("i value "+i++);
            break;
        }
        if(i==2)
        {
            System.out.println("Aniket");
        }
        System.out.println("meth10() executed");
    }

    public static void main(String[] args)
    {

        Type34 obj = new Type34();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        //obj.meth4();
        obj.meth5();
        obj.meth6();
        obj.meth7();
        obj.meth8();
        obj.meth9();
        obj.meth10();
    }


}
