package Aniket;

//static variable example
public class Type23
{
    int x;//0,0,0
    static int y; //0,1,2

    Type23()
    {
        x++;//1,1,1
        y++;//1,2,3
        System.out.println("Instance variable x: "+ x);
        System.out.println(" Static variable y: "+ y);
    }

    public static void main (String [] args)
    {
        new Type23();
        new Type23();
        new Type23();
    }
}
