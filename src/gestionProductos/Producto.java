package gestionProductos;

import java.util.UUID;

public class Producto {


   private UUID id;
    String referencia;
    byte numunidades;
    String fechaAlta;
    String FechaModificacion;

    public Producto( String referencia, byte numunidades, String fechaAlta) {
        this.id = UUID.randomUUID();
        this.referencia = referencia;
        this.numunidades = numunidades;
        this.fechaAlta = fechaAlta;
        this.FechaModificacion = null;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", referencia='" + referencia + '\'' +
                ", numunidades=" + numunidades +
                ", fechaAlta='" + fechaAlta + '\'' +
                ", FechaModificacion='" + FechaModificacion + '\'' +
                '}';
    }
}
