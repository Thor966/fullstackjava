package Aniket;

// You need to use the values return by the method

public class Type11
{
    int meth1(int a, String s) // meth3()
    {
        System.out.println(a);
        System.out.println((a*2)+3);
        System.out.println(s);
        return 4;
    }

    String meth2(String s , int x, int y) // main()
    {
        System.out.println(s);
        System.out.println(x);
        System.out.println(x/y);
        System.out.println("Bombe");
        String i= new Type11().meth4(34,"Kunal");
        return i +" Gawande";
    }

    int meth3(int p) // main()
    {
       int a = new Type11().meth1(20,"Java");
        System.out.println(p);
        return 56*a;
    }

    String meth4(int a , String s) // meth2()
    {
        System.out.println("meth4 () called");
        System.out.println("a");
        System.out.println(a);
        System.out.println();
        return s;
    }

    public static void main (String [] args)
    {
        Type11 obj = new Type11();
        System.out.println(obj.meth2("Aniket",78,60));
        int  x = obj.meth3(90);
        System.out.println(x);

    }

}