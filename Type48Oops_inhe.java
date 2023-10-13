package Aniket;

public class Type48Oops_inhe extends Type47Oops_inhe
{
void meth2()
{
    System.out.println("meth2() called");
    super.meth1();
    new Type48Oops_inhe();
}

    Type48Oops_inhe()
    {
        super.meth1();
        System.out.println("Type48 default constructor");

    }

    Type48Oops_inhe(int y)
    {
       // this(); c.e invalid
        super();

        super.meth1();
        System.out.println("type48 parameterised constructor");
    }

    public static void main(String[] args)
    {
       new Type48Oops_inhe().meth2();

    }
}
