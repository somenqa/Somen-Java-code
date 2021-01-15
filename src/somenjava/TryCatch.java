
package somenjava;

    public class TryCatch {
    public static void main(String[]argu){

      int myhousenumber =803;
      int myzipcode =205;
      int total=myhousenumber+myzipcode;
      String message="total is ";

        try{
            System.out.println(total==1345634);
            System.out.println(message+total);




        }catch(Exception m){
            m.printStackTrace();


        }


    }
}
