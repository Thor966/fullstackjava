package Aniket;

// understanding two diamentional array
// printing matrix
/*
1 2 3
4 5 6
6 7 8

 */
public class Type44
{
    void meth1()
    {
        int arr[] [] = {{1,2,3},{4,5,6},{6,7,8}};

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i] [j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        new Type44().meth1();

    }
}
