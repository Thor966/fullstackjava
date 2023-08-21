package Aniiket;

// There should not be any void method

public class Type9 {

int meth1 (int a , int b , int c, int d) //meth3
{
    System.out.println("meth1()");
    System.out.println(a);
    System.out.println(c-7);
    System.out.println(d);
    new Type9().meth4(6,87,'m');
    System.out.println(a+b+c+d);
    return 15*5;
}

String meth2 (int x , String s) //meth4
{
    System.out.println('x');
    System.out.println(s);
    System.out.println(x/2);
    return "SQL";
}

int meth3 (String s , int a , int c) //main
{
    System.out.println(s + " Gawande");
    new Type9().meth1(6,7,9,2);
    System.out.println(a+c);
    return new Type9().meth1(6,7,9,2);
}

String meth4 (int x, int y, char d) // meth1
{
    System.out.println("meth4()");
    System.out.println(y);
    System.out.println(x+y);
     String a = new Type9().meth2(1, "java");
    System.out.println(a);
    return "TATA";
}

public static void main(String [] args)
{
    System.out.println(new Type9().meth3("Aniket",34,76));
}





}
