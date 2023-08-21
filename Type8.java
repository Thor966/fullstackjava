package Aniiket;

//All be method should be parameterised method[minimum 2 parameters]

public class Type8 {
    void add (int a, int b, int c)//meth3
    {
        System.out.println("Addition of three values");
        System.out.println("Addition of a and b " + (a+b));
        System.out.println("Addition of b and c " + (b+c));
        System.out.println("Addition of a and c " + (a+c));
        String x = new Type8().meth4(4,"Java");
        System.out.println(x);

    }

    short sub (int x, int y) //main
    {
        System.out.println("Subtraction of two values");
        System.out.println(x);
        String s = new Type8().meth3("hello",3);
        System.out.println(x-y);
        System.out.println(s);
        return 43;
    }

    String meth3 (String s, int a) //sub
    {
       new Type8().add(56,66,98);
        System.out.println(s);
        System.out.println(a);
        return "Aniket";
    }

    String meth4(int b, String d)//add
    {
        System.out.println(b);
        System.out.println(d);
        return "Gawande";
    }

    public static void main (String [] args)
    {
        Type8 obj = new Type8();
        int a = obj.sub(65,45);
        System.out.println(a);

    }

}
