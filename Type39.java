package Aniket;

// this keyword
public class Type39
{
    static void meth1()
    {
        System.out.println("meth1() called");
    }

    void meth2()
    {
        this.meth1();
        System.out.println("meth2() called");
    }

    void meth3()
    {
        this.meth2();
        System.out.println("meth3() called");
    }

    public static void main(String[] args)
    {
       new Type39().meth3();
      // this.meth3(); // compile time error we cant use this keyword inside a static area.
    }

}
