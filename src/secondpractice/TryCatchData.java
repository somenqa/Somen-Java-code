package secondpractice;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class TryCatchData {
public static void main(String[]argu){

    int Bread=25;
    int Milk=12;

    int total =Bread+Milk;
    String message="Total price is $";

    try {
        System.out.println(message+total);
        System.out.println(total==90);

    } catch(Exception d){
        d.printStackTrace();

}
}

}

