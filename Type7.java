package Aniiket;
// Write 4 method in a class [Excluding main()]

import javax.imageio.stream.ImageInputStream;

public class Type7 {
void meth1 ()
{
    int a = 110;
    System.out.println("This is a meth1()");
    System.out.println(a);
}

int meth2()
{
    System.out.println("This is a meth2()");
    System.out.println(77+66);
    return 87;
}

String meth3(int a)
{
    System.out.println("This is a meth3 ()");
    System.out.println(a+76);
    return "Aniket";
}
char meth4(int a , int b , String s )
{
    System.out.println("This is a meth4()");
    System.out.println(a);
    System.out.println(b);
    System.out.println(a+b);
    return 'A';
}
public static void main (String [] aniket)
{
   Type7 a = new Type7();
   a.meth1();
   a.meth2();
   a.meth3(54);
   a.meth4(32,6,"My name is Aniket");

}


}
