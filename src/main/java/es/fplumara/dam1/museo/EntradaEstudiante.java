package es.fplumara.dam1.museo;

import java.time.LocalDate;

class EntradaEstudiante extends Entrada implements Descontable{
    private String centroEducativo;

    protected EntradaEstudiante(String id, double precioBase, LocalDate fecha,String centroEducativo) {
        super(id, precioBase, fecha);
        this.centroEducativo = centroEducativo;

    }


    @Override
    public double aplicarDescuento(int porcentaje) {
        double descuento = porcentaje /100;
        return this.getPrecioBase() * (1 - descuento);
    }

    @Override
    double precioFinal() { // HACEMOS METODOS QUE SE LLAMEN IGUAL PARA CUANDO LLAMEN DESDE MAIN SE LLAME A ESTE SI ES ENTRADAESTUDIANTE
        return aplicarDescuento(10);
    }

    @Override
    String descripcion() {
        return "";
    }
}
