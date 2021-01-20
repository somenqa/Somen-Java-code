package somenjava;

public class MethodOverloading {
    public static void main(String[] args){
        test1();
        test1(5,7);
    }

    public static void test1(){
        int new1=20;

        System.out.println(new1);

    }

    public static void test1(int x,int y){

        int result=x+y;

        System.out.println(result);
    }

}
