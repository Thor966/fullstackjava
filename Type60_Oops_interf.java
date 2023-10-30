package Aniket;

public class Type60_Oops_interf implements Type58_Oops_interf3,Type59_Oops_interf4
{
    public void meth1()
    {
        Type58_Oops_interf3.super.meth1();
        Type59_Oops_interf4.super.meth1();
    }
    public static void main(String[] args)
    {

        new Type60_Oops_interf().meth1();
    }
}
