package Aniket;
// this() constructor call
public class Type42
{
    String name;

    Type42()
    {
        this("Aniket Gawande");
        this.display();
    }

    Type42(String name)
    {
        this.name = name;
    }

    void display()
    {
        System.out.println("persons name is: "+name);
    }

    public static void main(String[] args)
    {
         Type42 obj = new Type42();
    }

}
