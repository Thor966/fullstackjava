package Aniiket;

// Every method should return a value

public class Type10 {
    int java1(int a) //java 3 a=2
    {
        System.out.println("meth1()");
        System.out.println(a);
        System.out.println(a*66);
        return 4;
    }

    String java2 (int a, String s, int b)// java 4 a=23, s=Gawande, b=45
    {
        System.out.println(a);
        System.out.println(b);
        new Type10().java3(2,"UI"); //4
        System.out.println(a*b);
        return s;
    }

    int java3(int x,String s) //java2 x=2,s = UI
    {
        System.out.println(x);
        System.out.println(x+3);
        return new Type10().java1(2);
    }

    String java4 (String s) //main
    {
        Type10 obj = new Type10();
        String w = obj.java2(23,"Gawande",45); // Gawande
        return w;
    }

    public static void main(String [] args)
    {
        System.out.println(new Type10().java4("Aniket"));
    }


}
