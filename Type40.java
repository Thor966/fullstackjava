package Aniket;

// this keyword

// It is used to return the instance of the present class.

// note:- we cant use 'this' keyword inside a static area
public class Type40
{
    Type40 meth1()
    {
        System.out.println("meth1() called");
        return this;
    }

    Type40 meth2()
    {
        System.out.println("meth2() called");
        return this;
    }

    Type40 meth3()
    {
        System.out.println("meth3() called");
        return this;
    }

    int meth4()
    {
        System.out.println("meth4() called");
        return 99;
    }

    public static void main(String[] args)
    {
        Type40 obj = new Type40();
        int x = obj.meth1().meth2().meth3().meth4(); //  method chaining
        System.out.println(x+1);
    }




}
