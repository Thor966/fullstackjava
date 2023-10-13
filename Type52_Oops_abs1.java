package Aniket;

public abstract class Type52_Oops_abs1
{
    abstract void meth1();
    abstract int msg();

    void meth2()
    {
        System.out.println("parent meth2()");
    }
     static void meth3()
    {
        System.out.println("parent meth3()");
    }
    Type52_Oops_abs1()
    {
        System.out.println("parent default constructor");
    }

    public static void main(String[] args)
    {
        System.out.println("parent class main() ");
        //new Type52_Oops_abs1(); c.e because we cannot create an abstract class object
        Type52_Oops_abs1.meth3();
    }

}
