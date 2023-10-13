package Aniket;

// method overloading
public class Type49_Ooops_poly
{
    final private static void meth1()
    {
        System.out.println(10);
    }
    final int meth1(int x)
    {
        System.out.println(20);
        return x;
    }

    static protected void meth1(String s) {
        System.out.println(30);
    }

    final static String meth1(int x, String s)
    {
        System.out.println(40);
        return s;
    }


    public void meth1(String s, int x)
    {
        System.out.println(50);
    }

    StringBuffer meth1(StringBuffer sb)
    {
        System.out.println(60);
        return sb;
    }

    protected void meth1(byte b)
    {
        System.out.println(70);
    }

    public static void main(String[] args)
    {
        Type49_Ooops_poly obj = new Type49_Ooops_poly();

        obj.meth1();
        obj.meth1(50);
        obj.meth1("Aniket");
        obj.meth1(344,"Aniket");
        obj.meth1("Kunal",43);
        obj.meth1(new StringBuffer("Aniket"));
        obj.meth1((byte)45);


    }
}
