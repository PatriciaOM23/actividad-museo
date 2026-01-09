package es.fplumara.dam1.museo;


import java.time.LocalDate;

class EntradaGeneral extends Entrada {


    protected EntradaGeneral(String id, double precioBase, LocalDate fecha) {
        super(id, precioBase, fecha);
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
