package Aniket;

public class Type53_Oops_abs2 extends Type52_Oops_abs1
{

    void meth1()
    {
        System.out.println("abstract method 1");
    }
    int msg()
    {
        System.out.println("abstract method 2");
        return 0;
    }
     void display()
     {
         System.out.println("Aniekt");
     }

     public static void main(String[] args)
     {
        Type52_Oops_abs1 obj = new Type53_Oops_abs2();
        obj.meth1();
        obj.msg();
        Type53_Oops_abs2 obj2 = new  Type53_Oops_abs2();
        obj2.display();
     }
}
