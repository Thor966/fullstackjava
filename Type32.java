package Aniket;

// selection statements (switch case)
public class Type32
{
    void meth1()
    {
        int input =4;

        switch(input) {
            case 1:
            case 2:
            default:
                System.out.println(4);
                System.out.println(1);
                System.out.println(2);
        }
    }

    public static void main(String[] args)
    {
        new Type32().meth1();
    }
}
