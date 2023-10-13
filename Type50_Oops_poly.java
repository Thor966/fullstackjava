package Aniket;

// method overriding
public class Type50_Oops_poly
{
    protected void meth1() // overridden method
    {
        System.out.println("Aniket 1");
    }

    public void meth2(int x)
    {
        System.out.println("Aniket 2");
    }

    protected void meth3(int x, String s)
    {
        System.out.println("Aniket 3");
    }

    static void meth4()
    {
        System.out.println("Aniket 4");
    }

    Type50_Oops_poly meth5()
    {
        System.out.println("Aniket 5");
        return new Type50_Oops_poly();
    }

}
