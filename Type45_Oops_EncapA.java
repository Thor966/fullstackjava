package Aniket;

// OOP's concept
// ENCAPSULATION
/*
It is the process of making a field as a private and providing to the access that
feild with the help of public methods i.e through setters and getters.
 */
public class Type45_Oops_EncapA
{
   private String empname;
   private int empid;
   private String empdept;

   /*
   we can access a private variable through the public methods
   using setters and getters methods.
    */
   public String getEmpname()
   {
       return empname;
   }
   public void setEmpname(String empname)
   {
       this.empname=empname;
   }

   public int getEmpid()
   {
       return empid;
   }
   public void setEmpid(int empid)
   {
       this.empid=empid;
   }

   public String getEmpdept()
   {
       return empdept;
   }
   public void setEmpdept(String empdept)
   {
       this.empdept=empdept;
   }

}
