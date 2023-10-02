package Aniket;

// for-each loop
// difference between for and for-each loop
public class Type35
{
    void meth1()
    {
        int arr[] ={10,20,30,40,50};
        System.out.println("Redirecting the data in forward direction by using for loop");

        for(int i=0;i<=4;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");

        System.out.println("Retrieving the data in a backward direction by using for loop");

        for(int i=4;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");

        System.out.println("Retrieving data by using for-each loop");

        for(int x:arr)
        {
            System.out.print(x+" ");
        }

        /*
        for loop:-
       ------------
              for loop will be working on index position of an array
              so by using for loop we can retrieve the data both forward and backward directions.


         for_each loop:-
       ------------------
               for-each loop will not be working on streaming data so by using for-each loop we cannot retrieve
               data in backward direction.
               (we can retrieve the data only in forward direction)
         */
    }

    public static void main(String[] args)
    {
        new Type35().meth1();
    }

}
