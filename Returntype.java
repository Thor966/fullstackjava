public class Returntype {
    void meth1()
    {
        int a = 44;
        Returntype b = new Returntype();
        System.out.println("Java is awesome");
        b.meth2();
        System.out.println(a + 5);
    }


     void meth2 ()
     {
         System.out.println("meth2() called");

     }

     public static void main (String[] aniket)
     {
         System.out.println("Start");
        Returntype a = new Returntype();
        a.meth1();

     }
}
