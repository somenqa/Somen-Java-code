package secondpractice;

public class ForLoopEvenNmbData {
public static void main(String[]args){

    int a = 100;
    System.out.print("Even Numbers from 1 to "+a+" are: ");

    for (int i = 1; i <= a; i++) {
        if (i % 2 == 0) {
            System.out.print(i + " ");
        }
    }
}

}
