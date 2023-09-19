package Aniket;

public class Type29
{
    void meth1()
    {
        System.out.println("****Performing a autoboxing****");

        int i = 100;
        Integer i1 = new Integer(i); // 1st way
        Integer i2 = i; // 2nd way
        Integer i3 = Integer.valueOf(i); //3rd way , valueOf() is a static method

        System.out.println("value of PDT is i: "+ i);
        System.out.println("value of wrapper class object i1: "+i1);
        System.out.println("value of wrapper class object i2: "+i2);
        System.out.println("value of wrapper class object i3: "+i3+ "\n");

        byte b =25;
        Byte b1 = b;
        Byte b2 = Byte.valueOf(b);
        System.out.println("value of PDT is b: "+ b);
        System.out.println("value of WCO is b1: "+ b1);
        System.out.println("value of WCO is b2: "+ b2+"\n");

        char c ='a';
        Character c1 = Character.valueOf(c);
        Character c2 = c;
        int x = c;
        System.out.println("value of PDT is c: "+ c);
        System.out.println("value of WCO is c1: "+c1);
        System.out.println("value of WCO is c2: "+c2);
        System.out.println("value of int is x: "+x+"\n");

        float f = 22.546f;
        Float f1 = f;
        Float f2 = Float.valueOf(f);
        System.out.println("value of PDT is f: "+ f);
        System.out.println("value of WCO is f1: "+ f1);
        System.out.println("value of WCO is f2: "+f2+"\n");

        boolean bol = true;
        Boolean bol1 = Boolean.valueOf(bol);
        System.out.println("value of PDT is bol: "+ bol);
        System.out.println("value of WDT is bol1: "+ bol1+"\n");
    }

    void meth2()
    {
        System.out.println("****Performed a Auto unboxing****");

        Integer ival = Integer.valueOf(200);
        int i = ival.intValue();
        int i2 = ival;
        System.out.println("value of WCO is ival: "+ ival);
        System.out.println("value of PDT is i :"+ i);
        System.out.println("value of PDT is i2: "+i2+"\n");

        Byte b = Byte.valueOf((byte)10);
        byte bvalue = b;
        byte bvalue2 = b.byteValue();
        System.out.println("value of WCO is b: "+ b);
        System.out.println("value of PDT is bvalue is: "+ bvalue);
        System.out.println("value of PDT is bvalue2 is: "+ bvalue2+"\n");
    }

    void meth3()
    {
        System.out.println("****meth3() called****");
        Integer ival = Integer.valueOf("198"); // Wrapper classes allow the  string numeric value
        System.out.println("ival: "+ival);

        Byte bval = Byte.valueOf("12");
        System.out.println("bval: "+ bval);

        Boolean bool = Boolean.valueOf("true");
        System.out.println("bool :"+ bool);

       // Character cha = Character.valueOf("A"); // character does not allow the string data
    }

    public static void main(String[] args)
    {
        Type29 obj = new Type29();
        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
}
