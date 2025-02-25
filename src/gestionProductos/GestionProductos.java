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

    public  void agregarProducto(){
        output.mostrarMensajeReferencia();
        String referencia = input.getString();
        output.mostrarMensajeUnidades();
        byte unidades = input.getInt();
        output.mostrarMensajefechaAlta();
        String fechaAlta = input.getString();

        listaProductos.add(new Producto(referencia,unidades,fechaAlta));


    }

    public  void listarProductos(){
        System.out.println("Referencia \t" + "Unidades\t" + "Creado el\t" + "Modificado el" );
        for (Producto lista: listaProductos){
            System.out.println(lista.getReferencia()+"      \t" + lista.getNumunidades()+"     \t" + lista.getFechaAlta()+"     \t" + lista.getFechaModificacion() );
        }




    }

    public  void venderProductos(){
        listarProductos();

        int i =0;
        boolean encontrado = false;

        output.mostrarMensajeReferencia();
        String referencia = input.getString();


        while (!encontrado && i < listaProductos.size()){

            if (listaProductos.get(i).getReferencia().equals(referencia)){
                encontrado = true;
            }else {
                i++;
            }

        }

        if (encontrado){


            output.mostrarMensajeVender();
            byte cantidadComprar = input.getInt();

            output.mostrarMensajefechaModificacion();
            listaProductos.get(i).setFechaModificacion("20250321");

            byte cantidadUnidadesActual = listaProductos.get(i).getNumunidades();

            int cantidadFinal = cantidadUnidadesActual - cantidadComprar;
            listaProductos.get(i).setNumunidades((byte)cantidadFinal);

        }







    }




    public  void comprarProductos(){
        listarProductos();

        int i =0;
        boolean encontrado = false;

        output.mostrarMensajeReferencia();
        String referencia = input.getString();


        while (!encontrado && i < listaProductos.size()){

            if (listaProductos.get(i).getReferencia().equals(referencia)){
                encontrado = true;
            }else {
                i++;
            }

        }

        if (encontrado){


            output.mostrarMensajeComprar();
            byte cantidadComprar = input.getInt();

            output.mostrarMensajefechaModificacion();
            listaProductos.get(i).setFechaModificacion("20250321");

            byte cantidadUnidadesActual = listaProductos.get(i).getNumunidades();

            int cantidadFinal = cantidadUnidadesActual + cantidadComprar;
            listaProductos.get(i).setNumunidades((byte)cantidadFinal);

        }







    }

}
