package Aniket;

public class Type20 {
    int a=10;
    public String testmethod1() {
        new Type20(100,200,"java");
        System.out.println(40);
        return new Type20().testmethod3(new Type20().testmethod2())+new Type20().testmethod4("hii");
    }
    Type20(){
        System.out.println("hii");
    }
    public int testmethod2() {
        System.out.println(50);
        return 10+15;
    }
    Type20 (int a){
        System.out.println("java is awesome");
    }
    public String testmethod3(int a) {
        System.out.println(18);
        return "is";
    }
    Type20(int a ,int b,String s){
        System.out.println(a+b);
        System.out.println(s);
    }
    public String testmethod4(String s) {
        System.out.println(88);
        return "good";
    }
    public static void main(String[] args) {
        Type20 t1 = new Type20();
        t1.a=10;
        Type20 t2 = new Type20(50);
        t2.a = 30;
        System.out.println("java"+t1.testmethod1()+" "+(t1.a+t2.a-30));
    }

}

