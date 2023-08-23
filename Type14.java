package Aniket;

// on date 23/08/23
// Task

public class Type14 {
    int display(int a) // main() 50   // show() 100
    {
        System.out.println(10);
        return a; // 100
    }

    int show()
    {
        System.out.println(20);
        return new Type14().display(100);
    }

    int meth1(int x, int y) // .. main() 49 , 1
    {
        return x+y;
    }

    int meth2(int x) // main() 10
    {
        return x*2;
    }

    int meth3(int x , int y , int z) // main() 10 , 10 , 5
    {
        System.out.println("Java is awesome");
        return x+y+z;
    }

    int meth4() // main()
    {
        return 5;
    }

    public static void main(String [] args)
    {
      Type14 obj = new Type14();                     //50       +             20     -               25           + 10 -        5 = 50 ----> display()
        System.out.println(obj.display(obj.meth1(49,1) + obj.meth2(10) - obj.meth3(10, 10, 5) + 10 - obj.meth4()));

        System.out.println(new Type14().show());
    }


}
