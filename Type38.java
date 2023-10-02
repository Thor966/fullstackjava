package Aniket;

// Understanding this keywords
// It is used is resolve the ambiguity between local variable and the instance variable.
public class Type38
{

    int x = 10;
    static int y = 20;

    void meth1()
    {
        int x = 100;
        int y = 200;
        System.out.println("Instance varaible x : "+this.x);
        System.out.println("static variable y :"+ Type38.y);
        System.out.println("static variable y :"+this.y);// not recomended

        System.out.println("Local variable x:"+x);
        System.out.println("Local variable y:"+y);
    }

    public static void main(String[] args)
    {
        new Type38().meth1();
    }
}
