package Aniket;


public class Type47Oops_inhe
{
       void meth1()
       {
           System.out.println("meth1() called");
       }

       Type47Oops_inhe()
       {
           System.out.println("default constructor");
       }

       Type47Oops_inhe(int x)
       {
           this();
           this.meth1();
           System.out.println("Parameterised constructor");
       }
}
