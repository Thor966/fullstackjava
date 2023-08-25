package Aniket;

       /*
        $$ Second method of object class is equals() method
        2) equals ()
        -------------
        ==> The return type pf equal method is boolean [true/false]
        ==> An equal () are compare address location of two objects
        ==> It both the object having same adress location then equal are return the true value
        otherwise equal() return the false value.


        $$ Third method of object is getclass() method
        3) getclass()
        --------------
        ==> It is provide to fully classifided class name.


        $$ Fourth method of object class is toString() method
        4) toString()
        ---------------
        ==> It converts an object into a string format
        ==> Internal structure of toString():-
        public String toString()
        {
           return getClass()+getclass() + "@" + Integer.toHexString(hashCode());
         }

        */

public class Type16 {
    void meth1()
    {
        System.out.println("I am a Aniket");
    }

    public static void main (String [] args)
    {
        Type16 obj1 = new Type16();
        Type16 obj2 = new Type16();

        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.equals(obj1));
        System.out.println(obj2.equals(new Type16()));
        System.out.println(new Type16().equals(new Type16 ()));

        System.out.println("--------------------------");

        System.out.println( "getClass :-" + obj1.getClass());
        System.out.println("getClas :-" + obj2.getClass());

        System.out.println("---------------------------");

        System.out.println("toString :-" + obj1.toString());
        System.out.println("tostring :-" + obj2.toString());
        System.out.println(obj1); // Compiler will internally call the toString()

    }
}
