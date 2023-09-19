package Aniket;

// This is a wrapper classes example. This is a autoboxing
public class Type28
{
    void meth1()
    {
        System.out.println("performing auto boxing");
        int i = 100;
        // Autoboxing
        Integer ivalue =  new Integer(i); // The Integer class is deprecated in version 1.9
        System.out.println("value of predefine data type i :"+ i);
        System.out.println("value of wrapper class object ivalue "+ ivalue);
    }

    public static void main (String[] args)
    {
        new Type28().meth1();
    }

}
