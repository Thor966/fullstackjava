package Aniket;

// Jump statement
public class Type36
{
    void meth1()
    {
        for(int i = 1;i<=10;i++)
        {
            if(i==5)
            {
                //break;
                //return;
                continue;

            }
            System.out.println("i value "+i);
        }
        System.out.println("Compiler came out from for loop");
    }

    public static void main(String[] args)
    {
        new Type36().meth1();
    }
}
