package Aniket;

public final class Type66_finalkeyword // ****final class cant be inherited
{
    final int x =10; // ****final variables are constant
    final void meth1()  // ****final method cant be overridden
    {
        System.out.println(x);
        //System.out.println(x++);
        System.out.println(x);
    }

    public static void main(String[] args)
    {
        new Type66_finalkeyword().meth1();
    }
}
/*
private methods:- we cannot inherit private methods so we cannot override.
----------------

final methods:- we can inherit the final methods but we cannot override the final methods.
---------------

 */