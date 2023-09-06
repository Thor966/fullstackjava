package Aniket;

// Constructor by assining a value for a instance variable

public class Type21
{
    String empname;
    int empid;
    String empdept;

    static String ecompany = "TCS";

    Type21(String name, int id, String dept)
    {
        empname = name;
        empid = id;
        empdept = dept;
    }

    public static void main (String [] args)
    {
         Type21 aobj1 = new Type21("Aniket",101,"java");
         Type21 aobj2 = new Type21("Vishal",102,"AWS");
        Type21 aobj3 = new Type21("Bhausaheb",103,"oracle");

        System.out.println("aobj1 :"+aobj1.empname+" " +aobj1.empid+" "+aobj1.empdept+ " "+Type21.ecompany);
        System.out.println("aobj2 :"+aobj2.empname+" "+aobj2.empid+" "+ aobj2.empdept +" "+Type21.ecompany);
        System.out.println("aobj3 :"+aobj3.empname+" "+aobj3.empid+" "+aobj3.empdept+" "+Type21.ecompany+"\n");

        aobj1.empname = "Datta";
        aobj2.empid = 109;
        aobj3.empdept = "civil";

        System.out.println("aobj1 :"+aobj1.empname+" "+aobj1.empid+" "+aobj1.empdept+" "+ aobj1.ecompany);
        System.out.println("aobj2 :"+aobj2.empname+" "+aobj2.empid+" "+aobj2.empdept+" "+ aobj2.ecompany);
        System.out.println("aobj3 :"+aobj3.empname+" "+aobj3.empid+" "+aobj3.empdept+" "+ aobj3.ecompany+"\n");

        aobj1.ecompany = "HCL";
        aobj2.ecompany = "KPMS";
        aobj3.ecompany = "Deloit";

        System.out.println("aobj1 :"+aobj1.empname+" "+aobj1.empid+" "+aobj1.empdept+" "+aobj1.ecompany);
        System.out.println("aobj2 :"+aobj2.empname+" "+aobj2.empid+" "+aobj2.empdept+" "+aobj2.ecompany);
        System.out.println("aobj3 :"+aobj3.empname+" "+aobj3.empid+" "+aobj3.empdept+" "+aobj3.ecompany);

    }
}
