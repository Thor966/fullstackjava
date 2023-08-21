package Aniiket;

public class Type6
{
    public String meth1 () // main()
    {
        System.out.println(35);
        return new Type6().meth3(new Type6().meth2()) + new Type6().meth4("here");   // "is" + "awesome"
    }

    public int meth2 () // meth 1
    {
        System.out.println(25);
        return 25+5;
    }

    public String meth3 (int a) // meth 1
    {
        System.out.println(15);
        return "is";
    }

    public String meth4(String s ) // meth 4
    {
        System.out.println(45);
        return "awesome";
    }

    public static void main (String [] args) {
        Type6 t = new Type6();
        System.out.println("java" + t.meth1());
    }
}
