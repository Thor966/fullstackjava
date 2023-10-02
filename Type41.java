package Aniket;

// this() constructor call
// It is used to called  present class constructor
// we need to use this() constructor call ONLY inside a constructor that to as a 1st statement.
public class Type41
{
     void meth1()
     {
         System.out.println("meth1() called");
     }

     Type41()
     {
         System.out.println("Default constructor called");
         this.meth1();
     }
     Type41(int x)
     {
         this();
         System.out.println("Parameterised constructor called");
     }

    public static void main(String[] args)
    {
        new Type41(100).meth1();

    }

}
