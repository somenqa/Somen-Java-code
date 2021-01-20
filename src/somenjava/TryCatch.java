
package somenjava;

    public class TryCatch {
    public static void main(String[]argu){

        int i=0;
        int j=20;


        try{
            System.out.println(i/j);

        }
        catch (Exception e){

         System.out.println("Divide by Zero is not possible"+e);
        }


    }

    }
