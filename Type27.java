package Aniket;

// Type Casting
public class Type27
{
    void implicit()
    {
        System.out.println("Performing implicit type casting");
        byte b = 10;
        int i1 = b;
        System.out.println("value of b is:"+b);
        System.out.println("value of i1 is:"+i1);
        float f = i1;
        System.out.println("value of f is :"+f);

        char c = 'A';
        int i2 = c;
        System.out.println("value of c is:"+c);
        System.out.println("value of i2 is :"+i2);
        //int and char are compatible datatypes
    }

    void explicit()
    {
        System.out.println("performing explicit typecasting");
        int x =100;
        byte b1 = (byte)x;
        System.out.println("value of x is:"+x);
        System.out.println("value of b1 is:"+b1);

        int x2 = 100;
        byte b2 = (byte)x2;
        System.out.println("value of x2 is:"+x2);
        System.out.println("value of b2 is:"+b2);

        /*
        [minimumrange +(result-maximumrange-1)]

        -128 + (500 - 127 - 1)====> 244
        -128 + (244 - 127 - 1)====> -12
         */

        /*
        Note:-
        ------
        In explicit tyepe casting if we are trying to store a value which is more than the range of the destination
        datatype we will not be getting any error or an exception the value will be reduced within the range of
        destination data type.
         */

        float f = 10.9999f;
        byte b3  = (byte)f;
        System.out.println("value of f is :"+f);
        System.out.println("value of b3 is :"+b3);
    }

    void meth1(int x)
    {
        System.out.println("hii");
    }

    void meth1(byte b)
    {
        System.out.println("hello");
    }

    public static void main(String[] args)
    {
      Type27 obj = new Type27();
      obj.implicit();
      obj.explicit();
      obj.meth1(10);
      obj.meth1((byte)50);
    }
}
