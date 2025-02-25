package output;

public class Output {

    public void mostrarMenu(){
        System.out.println("""
                Sistema de gestion de tienda
                1. Agregar Productos
                2. Mostrar Productos
                3. Vender Productos
                4. Comprar Productos
                5. Salir
                """);
    }

    public void mostrarMensajeReferencia(){
        System.out.println("Ingrese la referencia");
    }
    public void mostrarMensajeUnidades(){
        System.out.println("Ingrese la cantidad de unidades");
    }
    public void mostrarMensajefechaAlta(){
        System.out.println("Ingrese la fecha de alta  YYYYMMDDTHH:mm");
    }

    public void mostrarMensajefechaModificacion(){
        System.out.println("Ingrese la fecha de modificacion  YYYYMMDDTHH:mm");
    }

    public void mostrarMensajeComprar(){
        System.out.println("Ingrese la cantidad a comprar");
    }
    public void mostrarMensajeVender(){
        System.out.println("Ingrese la cantidad a vender");
    }
}
