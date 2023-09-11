package Aniket;

// if else example
public class Type22
{
    void meth1()
    {
        int x =10;
        if(x>-10)
        {
            System.out.println("hi");
            System.out.println("If block is executed");
        }
        else
        {
            System.out.println("hello");
            System.out.println("else block is executed");
        }
    }

    void ageeligibility(String s, int age)
    {
        if(age>=18)
        {
            System.out.println(s + "as your age is "+ age +"you are eligible for vote");
        }

        else
        {
            System.out.println("you are not eligible for voting");
        }
    }

    void exameligibility(int age)
    {
        System.out.println(" checking eligibility of exam");
        if(age>=21 || age<=35)
        {
            System.out.println("you are eligilbe for exam");
        }
        else
        {
            System.out.println("ypu are not eligible for exam");
        }
    }

    public static void main (String [] args)
    {
          Type22 obj = new Type22();

          obj.meth1();
          obj.ageeligibility("Aniket",21);
          obj.exameligibility(25);

    }
}
