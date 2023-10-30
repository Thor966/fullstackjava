package Aniket;


 class clonemethod
{
    int a = 10;
    int b = 20;
}

class clonemethod2 implements Cloneable
{
    int x =100;
    int y = 200;

    clonemethod2 show() throws Exception
    {
       clonemethod2 obj =(clonemethod2)super.clone();
       return obj;
       //return (clonemethod2)super.clone(); // we can write these also
    }

}
public class Type68_clonemethod
{
    void meth1() throws Exception
    {
        System.out.println("Implementing Object cloning");
        clonemethod obj1 = new clonemethod();
        System.out.println(obj1.a+" "+obj1.b);
        clonemethod obj2 = obj1;
        obj2.b=50;
        System.out.println(obj1.a+" "+obj1.b+" "+obj2.b);

        clonemethod2 obj3 = new clonemethod2();
        System.out.println(obj3.x+" "+obj3.y);

        clonemethod2 cobj = obj3.show();
        cobj.y=5000;
        System.out.println(obj3.x+" "+obj3.y+" "+cobj.y);
        System.out.println(cobj.x);
    }
    public static void main(String[] args) throws Exception
    {
        Type68_clonemethod obj4  = new Type68_clonemethod();
        obj4.meth1();
    }



}
