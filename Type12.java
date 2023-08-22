package Aniket;

// From main() call only one methode

public class Type12 {
    int meth1 (int a , int b, String s) // meth3 33, 70, hello
    {
        System.out.println(a);
        System.out.println(a/b);
        System.out.println(b*33);
        return 10;
    }

    String meth2 (String s , int a , String p) //main() india, 20 , Maharastra
    {
        System.out.println(s);
        System.out.println("a");
        System.out.println(p);
        String x = new Type12().meth4("Buldhana",3,5);
        System.out.println(x);
        int c = a+66;
        System.out.println(c);
        return "Gawande";
    }

    int meth3 (int x) //meth4() 49
    {
        System.out.println("x");
        System.out.println((x+8)*7);
        return new Type12().meth1(33,70,"Hello");
    }

    String meth4 (String s , int p, int q) // meth2() buldhana , 87 ,5
    {
        System.out.println(p);
        System.out.println(s);
        new Type12().meth3(49);
        System.out.println(34 +(p*q));
        return "Kunal";
    }


    public static void main(String [] args)
    {
        Type12 obj = new Type12();
        String a = obj.meth2("India",20,"Maharastra");
    }

}

