package Aniket;

    /*
        $$ Fifth method of object class is finalize() methode
        5) Finalize()
        ----------------
        ==> It is called by the internally by the garbage collector
    */

public class Type17 {
    void meth1()
    {
        System.out.println("My name is Aniket Gawande");
    }

    protected void Finalize()
    {
        System.out.println("Garbage has been collected");
    }

    public static void main (String [] args)
    {
     Type17 obj1 = new Type17();
     Type17 obj2 = new Type17();

     obj1.meth1();

     obj1=null;
     System.gc(); // It is to process called garbage collector manually
       // obj1.meth1(); // It generates is null pointer Exception
    }
}
