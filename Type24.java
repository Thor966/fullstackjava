package Aniket;

// Example of static method
public class Type24
{
    int x =10; // Instance/nonstaic variable
    static int y =20; // static variable

    void meth1() // Instance/non-static/normal method
    {
        System.out.println("Instance variable :"+ x);
        System.out.println("static variable :"+ y);
    }
    static void meth2()
    {
        System.out.println("instance variable :"+ new Type24().x); // we can acess a non-static variable in static method
        //but with the help of respective class object.
        System.out.println("static variable : "+ y);
    }

    public static void main (String[] args)
    {
        Type24 obj = new Type24();
        obj.meth1();
        System.out.println("----------------");
         meth2(); // By using identifier
         new Type24().meth2(); // By using respective class object
         Type24.meth2(); // By using classname
    }
}
