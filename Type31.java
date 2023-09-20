package Aniket;

// selection statement (switch case)

import javax.swing.*;

public class Type31
{
    void meth1(String name, int age, String vehicle, int noofyear, String model)
    {
        System.out.println("Implementing switch case");
        int x =10;
        byte b = 20;
        final int i = 40;
        //i++;//C.E because of final variable are constant

        switch(b+10+35)
        {
            // System.out.println("Hello World"); // C.E because of single statement is not allow in switch case
            case 10-5:
                System.out.println("case 5 executed");
                break;
            case 200:
                System.out.println("case 20 executed");
                break;
            case 'A':
                System.out.println("case 65 executed");
                System.out.println("int & char both are compatible datatypes");
                if(age>=18)
                {
                    System.out.println(name+" is eligible for vote");

                    switch(vehicle)
                    {
                        case "Bike":
                            System.out.println(name+" is having a 2 wheeler");
                          String result  = new Type31().insurance(noofyear);
                            System.out.println(result);
                            break;
                        case "car":
                            System.out.println(name+" is having a car");

                            switch(model)
                            {
                                case "tata":
                                    System.out.println(name+" is having a tata's car");
                                    break;
                                case "mahindra":
                                    System.out.println(name+" is having a mahindra's car");
                                    break;
                                case "bugati":
                                    System.out.println(name+" is having a bugati's car");
                                    break;
                            }
                           String results =new Type31().insurance(noofyear);
                            System.out.println(results);
                            break;
                        default:
                            System.out.println("Invalid input");
                            break;
                    }


                }
                else
                {
                    System.out.println(name+" is not eligible for vote");
                }
                break;

            case i:
                System.out.println("case 40 executed");
                break;
            case 50:
                System.out.println("case 50 executed");
                break;



        }
        System.out.println("compiler came out from switch case");
    }

    String insurance(int year)
    {
        if(year>=1)
            return "valid insurance";
        else
            return "Invalid insurance";
    }

    public static void main(String[] args)
    {
        new Type31().meth1("Aniket",22,"car",3,"mahindra");
    }
}
