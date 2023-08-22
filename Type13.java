package Aniket;


// Every method should be executed
public class Type13 {
    int jdk1 (int x) // jdk4
    {
        System.out.println("meth1() is called");
        new Type13().jdk3("Indian", 60,90,34);
        System.out.println(x);
        System.out.println(x/2);
        return 30;
    }

    int jdk2 (String s) // jdk3()
    {
        System.out.println("meth2() is called");
        System.out.println("The capital of india is : ");
        System.out.println(s);
        return 70;
    }

    int jdk3 (String q , int x, int y , int z) //jdk1()
    {
        System.out.println("meth3() is called");
       int p = new Type13().jdk2("Hello");
        System.out.println(x/p);
        System.out.println(q);
        System.out.println(z+(x/y));
        System.out.println(x+y);
        return 40;
    }

    int jdk4 (String r,int a ) // main()
    {
        System.out.println("meth4() is called");
        int  s= new Type13().jdk1(22);
        System.out.println(a+s);
        System.out.println(r);
        return 10;
    }

    public static void main (String [] args)
    {
        Type13 obj = new Type13();
        System.out.println(obj.jdk4("Rasia",20));
    }

}
