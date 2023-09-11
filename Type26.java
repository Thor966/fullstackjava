package Aniket;
//Example of static variable and static blocks
public class Type26
{
    static int a = new Type26().meth1();

    static int meth1()
    {
        System.out.println("meth1()  called");
        return 100;
    }
    static
    {
        System.out.println("static block executed");
    }

    public static void main(String[] args) {
        System.out.println("main() caleed :"+ a);
        new Type26().meth1();
    }

}
