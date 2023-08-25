package Aniket;

/* Object class methods
there are 11 object class method
1) hashcode method
--------------------
==> Hashcode does not provide address location of object
==> Hashcode are generates a unique identification number of class object
==> Hashcode is used distinguish two objec seperatly
==> Hashcode return type is int
 */

public class Type15 {

    void meth1()
    {
        System.out.println("meth1() called");
    }

    public static void main (String [] args)
    {
        Type15 aobj1 = new Type15();
        Type15 aobj2 = new Type15();

        int aobj1hashcode = aobj1.hashCode();
        int aobj2hashcode = aobj2.hashCode();

        System.out.println("aobj1hashcode :" + aobj1hashcode);
        System.out.println("aobj2hashcode :" + aobj2hashcode);
    }
}
