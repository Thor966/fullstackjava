package Aniiket;

public class Type4 {
    void meth1()
    {
        System.out.println(10);
        System.out.println(64);
        System.out.println("End");
    }

    int  meth2(int a , int b , int c)
    {
        System.out.println(a);
         Type4 obj = new Type4();
         String s  = obj.meth5(100,"Java is awesome");
        System.out.println(s);
        return a-b;
    }

    String meth3 (String s , int b , int d )
    {
        System.out.println(b+d);
        return s;
    }
    int meth4 (int c , int k)
    {
        System.out.println(k);
        Type4 obj = new Type4();
       int  result = obj.meth2(50,50,50);
        System.out.println(result);
       return k+10;

    }
    String meth5(int a , String L)
    {
        System.out.println(a+a);
        Type4 obj = new Type4();
        String s = obj.meth3("hi",15 ,10);
        System.out.println(s);
        return L;
    }
    public static void main(String [] aniket)
    {
        Type4 obj = new Type4();
        System.out.println("START");
        int result =  obj.meth4(20,10);
        obj.meth1();
    }

}
