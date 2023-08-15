public class Type3 {
    int meth1 ()
    {
        System.out.println("meth1 () called");
        return 100;
    }

    int meth2 ()
    {
        System.out.println("meth2() called");
        return 200;
    }

    public static void main(String [] aniket)
    {
        int i = new Type3().meth1();
        System.out.println(new Type3().meth2());
        System.out.println(new Type3().meth1()+i+new Type3().meth2());
    }
}
