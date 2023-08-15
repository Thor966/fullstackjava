public class Type2 {
    int meth1 (){
        System.out.println("My name is Aniket");
        System.out.println("This method 1 is return to integer value");
        new Type2().meth3("International centre of exellence in engineering and management, chh sambhajinagar");
        return 30;
    }
    int meth2(int x , int y )
    {
        System.out.println("This method is prameteriesed method");
        System.out.println(x+y);
        System.out.println(y);
        return 80;
    }
    int meth3(String msg)
    {
        System.out.println("This method is String type");
        System.out.println(msg);
        return 20;
    }
    public static void main (String []args)
    {
        System.out.println("Start");
        int x =new Type2().meth1();
       int y = new Type2().meth2(44,5);
        System.out.println(x);
        System.out.println(y);

        System.out.println("End");
    }
}


