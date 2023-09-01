package Aniket;

// Constructor starting
public class Type19 {
    void meth1()
    {
        System.out.println("meth1() called");
        new Type19(1000);
    }

    Type19()
    {
        new Type19(500).meth1();
        System.out.println("Parameterised constructor called");
    }

    Type19(int a)
    {
        System.out.println("Non-parameterised constructor called" + a);
    }

    public static void main(String[] args)
    {
         new Type19().meth1();
    }

}
