package somenjava;

    public class CitiBank extends MethodOveriding{

        public static void main(String[] args){

            CitiBank test1=new CitiBank();
            System.out.println(test1.getHomeLoan());
        }

        public double getHomeLoan(){
            return 1.2;
        }
    }

