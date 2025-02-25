package input;

import java.util.Scanner;

public class Input {

    String palabra;
    int numero;

    Scanner sc = new Scanner(System.in);


    private void palabra(){
        palabra = sc.nextLine();
    }
    private void numero(){
        numero =Integer.parseInt( sc.nextLine());
    }

    public String getString(){
        palabra();
        return palabra;
    }

    public int getInt(){
        numero();
        return numero;
    }
}
