package Aniket;
import java.util.Scanner;
public class Type46_Oops_EncapA2
{
    void meth1()
    {
        Scanner sc = new Scanner(System.in);
        Type45_Oops_EncapA obj = new Type45_Oops_EncapA();

        System.out.println("What is your name");
        String name = sc.next();
        //obj.empname =name; compiletime error because of we can access the private variable
         obj.setEmpname(name);

        System.out.println("Enter your id");
        int id = sc.nextInt();
        //obj.empid=id; compiletime error because of we can access the private variable
        obj.setEmpid(id);

        System.out.println("Enter your dept");
        String dept = sc.next();
        //obj.empdept = dept; compiletime error because of we can access the private variable
        obj.setEmpdept(dept);

        System.out.println("User entered data are: ");
       // System.out.println("EmpNmae: "+obj.empname); compiletime error because of we can access the private variable
        System.out.println("EmpName: "+obj.getEmpname());

        //System.out.println("EmpId: "+obj.empid); compiletime error because of we can access the private variable
        System.out.println("EmpId: "+obj.getEmpid());

        //System.out.println("EmpDept: "+obj.empdept); compiletime error because of we can access the private variable
        System.out.println("EmpDept: "+obj.getEmpdept());

        sc.close();

    }

    public static void main(String[] args)
    {
        new Type46_Oops_EncapA2().meth1();

    }
}
