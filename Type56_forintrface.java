package Aniket;

public class Type56_forintrface extends Type57_forintrface implements Type54_Oops_interf1,Type55_Oops_interf2
{
    public void meth1()
    {
        System.out.println("Interface1 meth1() overridden");
    }
    public String data(int a)
    {
        System.out.println("Interface1 data() overridden");
        return "Aniket";
    }

   public void info()
    {
        System.out.println("Interface2 info() method");
    }


    void display()
    {
        System.out.println("Type56_forintrface method");
    }

    public static void main(String[] args)
    {
       Type54_Oops_interf1 obj = new Type56_forintrface();
       obj.meth1();
       obj.meth2();
       obj.data(34);
       //obj.meth4(); // because of private access modifier cannot be inherite or override
        Type56_forintrface obj2 = new Type56_forintrface();
        obj2.info();
        obj2.display();
        obj2.show();


    }

}
