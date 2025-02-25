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

    public String getReferencia() {
        return referencia;
    }

    public byte getNumunidades() {
        return numunidades;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public String getFechaModificacion() {
        return FechaModificacion;
    }

    public void setFechaModificacion(String fechaModificacion) {
        FechaModificacion = fechaModificacion;
    }

    public void setNumunidades(byte numunidades) {
        this.numunidades = numunidades;
    }

    @Override
    public String toString() {
        return
                 id +
                 referencia +
                 numunidades +
                 fechaAlta +
                 FechaModificacion
                ;
    }
}
