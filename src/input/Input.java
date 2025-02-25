package input;

import java.util.Scanner;

public class Input {

    String palabra;
    byte numero;

    Scanner sc = new Scanner(System.in);


    private void palabra(){
        palabra = sc.nextLine();
    }
    private void numero(){
        numero =Byte.parseByte( sc.nextLine());
    }

    public String getString(){
        palabra();
        return palabra;
    }

    public byte getInt(){
        numero();
        return numero;
    }
}
