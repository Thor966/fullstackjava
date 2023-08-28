package Aniket;

public class Type18 {

    void meth1()
    {
        System.out.println(10);
        System.out.println(20);
        System.out.println(30);
        return;
    }

    int meth2()
    {
        System.out.println("second meth is called");
        return 100;
        //System.out.println("Aniket"); // because of unreachable code
    }

    int meth3(int x)
    {
        System.out.println("Third method is called");
        System.out.println("x :" + x);
        System.out.println("int & char both are compatible datatype");
        return 'A';
    }

    int meth4(int i)
    {
        System.out.println("fourth method is called");

        if (i>=100)
        {
            System.out.println("If block is executed");
            return 1000;
            // System.out.println("Aniket Gawande");//this is a unreachable code
        }

        else
        {
            System.out.println("else block is executed");
            return 4000;
           // System.out.println("hii"); // this is a unreachable statement
        }
    }

    Type18 meth5()
    {
        System.out.println("fifth method is called");
     Type18 obj = new Type18();
        System.out.println("hashcode :" + obj.hashCode());
        System.out.println(obj); // it is internally call the toString()
        System.out.println(obj.toString());
        return obj;
    }

    public static void main(String[] args) {
        System.out.println("Start");
     Type18 aobj = new Type18();
     aobj.meth1();
        System.out.println("-------------");
        System.out.println(aobj.meth2()-99);
        System.out.println("--------------");
        System.out.println("meth3() is returning :"+ aobj.meth3('a'));
        System.out.println("--------------");
        aobj.meth4(150);

     Type18 x = aobj.meth5();
        System.out.println(x);
        System.out.println("hashCode" + x.hashCode());
        System.out.println("End");
    }
}
