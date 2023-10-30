package Aniket;

public interface Type54_Oops_interf1
{
    void meth1();
    String data(int a);

    default void meth2()
    {
        System.out.println("Interface1 default method");
        this.meth4();
    }

    static void meth3()
    {
        System.out.println("Interface2 static method");
    }

    private void meth4()
    {
        System.out.println("Interface1 private method");
    }

    public static void main(String[] args)
    {
        System.out.println("Interface1 main() method");
        Type54_Oops_interf1.meth3();

    }


}
