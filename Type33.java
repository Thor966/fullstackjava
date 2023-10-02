package Aniket;

// Iteration Statements (while loop)

public class Type33
{

    void meth1(int i)
    {
        System.out.println("-------meth1()-------");
        while(i<=10)
        {
            System.out.println("i value"+i);
        }
        System.out.println("meth1() executed");
    }

    void meth2(int i)
    {
        System.out.println("-------meth2()-------");
        while(i<=10)
        {
            System.out.println("i value"+ ++i);
            i++;
        }
        System.out.println("meth2() executed");
    }

    void meth3(int i)
    {
        System.out.println("-------meth3()-------");
        while(i<=10)
        {
            System.out.println("i value "+ i++ +" "+ i++);
            i++;
        }
        System.out.println("meth3() executed");
    }

    void meth4(int i)
    {
        System.out.println("-------meth4()-------");
        while(i<=10)
           // int a = 10; // compilation error
            System.out.println("i value "+ ++i +" "+ ++i);
             i++;
        System.out.println("====> "+i);
            System.out.println("meth4() executed");
    }

    void meth5(int i)
    {
        System.out.println("-------meth5()-------");
        while(true)
        {
            System.out.println("i value"+i);
            i++;
        }
        //System.out.println("meth5() executed"); // c.e because of these code is unreachable code
    }

    void meth6(int i)
    {
        System.out.println("-------meth6()-------");

        do {
            System.out.println("i value"+i);
            i++;
        }
        while(i<=10);
        System.out.println("meth6() executed");
    }

    public static void main(String[] args)
    {
       Type33 obj = new Type33();
       obj.meth1(100);
        obj.meth2(1);
        obj.meth3(1);
        obj.meth4(1);
        //obj.meth5(1);
        obj.meth6(1);
    }

}
