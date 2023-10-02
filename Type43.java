package Aniket;

// Understanding Array

import java.util.Arrays;
public class Type43
{
    /*
    Array declare in 4 ways:-
    1) int arr[];
    arr=new int [5];

    2) int arr[]=new int[5];

   3) int arr[]={10,20,30,40,50};

   4) int arr[]=new int[] {10,20,30,40,50};
     */

    void meth1()
    {
        System.out.println("Implementing java array");


        int arr1[];
        arr1=new int[5];

        int arr2[]=new int[4];

        int arr3[]={100,200,300};
        int arr4[]=new int[] {11,22,33,44,55,66};

        String s = "Java";

        System.out.println("arr1 length : "+arr1.length);
        System.out.println("arr2 length : "+arr2.length);
        System.out.println("arr3 length : "+arr3.length);
        System.out.println("arr4 length : "+arr4.length);

        System.out.println("String lenth: "+ s.length());
        System.out.println("------------------------------");

        System.out.println("arr1 "+Arrays.toString(arr1));
        System.out.println("arr2 "+Arrays.toString(arr2));
        System.out.println("arr3 "+Arrays.toString(arr3));
        System.out.println("arr4 "+Arrays.toString(arr4));

        System.out.println("----------------------------------------");

        arr1[1]=25;
        arr1[3]=45;

        System.out.println("arr1: "+Arrays.toString(arr1)); //[0,25,45,0,0]
        /*
        Index position of an array is to pass the values into an array and retrive the values from the array
         */
        System.out.println("---------------------------------------------");

        System.out.println(arr1[2]);
        System.out.println(arr1[arr1.length-1]);
        System.out.println(arr3[arr3.length-1]);
        System.out.println(arr4[arr2.length/2]);
        //System.out.println(arr4[arr4.length]); // It generates the ArrayIndexOutOfBoundException

        System.out.println("---------------------------------");

        System.out.println("Retriving the data from an array by using for loop");

        for(int i=0;i<=arr4.length-1;i++)
        {
            System.out.print(arr4[i]+" ");
        }
        System.out.println("\n");

        for(int p:arr4)
        {
            System.out.print(p+" ");
        }

    }

    public static void main(String[] args)
    {
      new Type43().meth1();
    }
}
