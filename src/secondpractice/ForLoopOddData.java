package secondpractice;

    public class ForLoopOddData {
    public static void main(String[]args) {

        int s = 100;
        System.out.print("Odd Numbers from 1 to "+s+" are: ");

        for (int i = 1; i <= s; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
    }
