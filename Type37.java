package Aniket;
import java.util.Scanner;
// Understanding Scanner class
public class Type37
{
    static Scanner sc = new Scanner(System.in);
    void meth1()
    {
        System.out.println("Enter your first number");
        int x = sc.nextInt();
        System.out.println("value of x "+x);

        System.out.println("Enter your second number");
        int y = sc.nextInt();
        System.out.println("value of y "+y);

        int z = x+y;
        System.out.println("Addition "+z);

    }

    void meth2()
    {

        System.out.println("Enter your number");
        int num = sc.nextInt();
        if(num%2==0)
        {
            System.out.println(num+" is  a even number");
        }
        else
        {
            System.out.println(num+" is a odd number");
        }

    }

    void meth3(String name, int age)
    {

        if(age>=18)
        {
            System.out.println(name+" is eligible for vote");
        }
        else
        {
            System.out.println(name+" is not eligible for vote");
        }
    }

    int meth4(int x)
    {
        if(x<=10)
        {
            System.out.println("if block executed");
            return sc.nextInt();
        }
        else
        {
            System.out.println("else block executed");
            return sc.nextInt()+100;
        }
    }



    public static void main(String[] args)
    {
      Type37 obj = new Type37();
      //obj.meth1();
        // obj.meth2();
//        System.out.println("What is your name");
//         String name = sc.nextLine();
//        System.out.println("What is your age");
//          int age=sc.nextInt();
//        obj.meth3(name,age);
        System.out.println(obj.meth4(50));

    }
}
