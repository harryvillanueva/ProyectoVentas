package principal;

import input.Input;
import output.Output;
import validador.Validador;

public class VentasApp {


    private static final int AGREGARPRODUCTO = 1;
    private static final int MOSTRARPRODUCTOS = 2;
    private static final int VENDERPRODUCTOS = 3;
    private static final int COMPRARPRODUCTOS = 4;
    private static final int SALIR = 5;
    private static boolean quiereSeguir;
    private static int opcionMenu;
    private static Output output;
    private static Input input;
    public static void main(String[] args) {
        output = new Output();
        input = new Input();
        quiereSeguir= true;


        do {
            do {
                mostrarMenu();
                recibirOpcionMenu();
            }while(!validarOpcionMenu());
                ejecutarPrograma();
        }while (quiereSeguir);

    }

    private static boolean validarOpcionMenu() {
        Validador validador = new Validador();
       return validador.opcionValida(opcionMenu);
    }

    private static int recibirOpcionMenu(){
        return opcionMenu= input.getInt();

    }

    private static void mostrarMenu() {
        output.mostrarMenu();
    }

    private static void ejecutarPrograma(){


        switch (opcionMenu){
            case AGREGARPRODUCTO ->{


            }
            case MOSTRARPRODUCTOS ->{

            }
            case VENDERPRODUCTOS ->{

            }
            case COMPRARPRODUCTOS ->{

            }
            case SALIR ->{
                quiereSeguir =false;
            }
        }
    }
}
