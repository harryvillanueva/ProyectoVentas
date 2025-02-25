package validador;

public class Validador {

    public boolean opcionValida(int opcionMenu) {
        return (opcionMenu > 0 && opcionMenu < 6) ;
    }
}
