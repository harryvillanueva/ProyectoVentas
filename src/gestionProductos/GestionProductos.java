package gestionProductos;

import input.Input;
import output.Output;

import java.util.ArrayList;
import java.util.List;

public class GestionProductos {
    public static List<Producto> listaProductos;
    public static Output output ;
    public static Input input ;

    public GestionProductos() {

        listaProductos = new ArrayList<>();
        output = new Output();
        input = new Input();
    }

    public  void agregarAlumno(){
        output.mostrarMensajeReferencia();
        String referencia = input.getString();
        output.mostrarMensajeUnidades();
        byte unidades = input.getInt();
        output.mostrarMensajefechaAlta();
        String fechaAlta = input.getString();

        listaProductos.add(new Producto(referencia,unidades,fechaAlta));


    }

}
