package secondpractice;

public class ElseIf {
public static void main(String[]args){

    int orange = 200;
    int apple = 290;
    int banana = 300;
    int Melon = 212;
    int Grapes = 340;

    if (orange>Melon){
        System.out.println("orange is cheap price");
    }
    else if (apple<orange){
        System.out.println("apple is good");
    }
   else if (Grapes>banana){
        System.out.println("Grapes price is reasonable");

    }
    else if (banana<Melon){
       System.out.println("Melon is Sweet");

    }
        else {
        System.out.println("All fruits are good");
    }
}
}
