package es.fplumara.dam1.museo;


import java.time.LocalDate;

class EntradaGeneral extends Entrada {


    protected EntradaGeneral(String id, double precioBase, LocalDate fecha) {
        super(id, precioBase, fecha);
    }

    public String toString(){
        return "ID" + getId()
                + " Precio" + getPrecioBase()
                + " Fecha" + getFecha();

    }

   @Override
    double precioFinal() {
        return this.getPrecioBase();
    }

    @Override
    String descripcion() {
        return "";
    }


}
