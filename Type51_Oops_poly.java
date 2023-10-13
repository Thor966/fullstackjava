package Aniket;

// method overriding
public class Type51_Oops_poly extends Type50_Oops_poly
{
    @Override
    public void meth1() // overriding method
    {
        System.out.println("Gawande 1");
    }

    @Override
    public void meth2(int x)
    {
        System.out.println("Gawande 2");
    }

    @Override
    public void meth3(int x, String s)
    {
        System.out.println("Gawande 3");
    }

    //@Override  can't override the static method
    static void meth4()
    {
        System.out.println("Gawande 4");
    }

    @Override
    Type51_Oops_poly meth5()
    {
        System.out.println("Gawande 5");
        return new Type51_Oops_poly();
    }

    public static void main(String[] args)
    {
      Type50_Oops_poly obj1 = new Type50_Oops_poly();
      obj1.meth1();

      Type51_Oops_poly obj2 = new Type51_Oops_poly();
      obj2.meth2(45);
      obj2.meth3(87,"kunal");
      obj2.meth4();
      obj2.meth5();

    }
}
