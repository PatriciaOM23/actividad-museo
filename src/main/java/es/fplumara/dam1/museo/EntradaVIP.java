package es.fplumara.dam1.museo;

import java.time.LocalDate;

class EntradaVIP extends Entrada implements Descontable, ConAccesoRapido {
    private String zonaVIP;
    private int nivelPrioridad;

    protected EntradaVIP(String id, double precioBase, LocalDate fecha, String zonaVIP, int nivelPrioridad) {
        super(id, precioBase, fecha);
        this.zonaVIP = zonaVIP;
        this.nivelPrioridad = nivelPrioridad;
    }


    @Override
    public double aplicarDescuento(int porcentaje) {
        double descuento = porcentaje /100;
        return this.getPrecioBase() * (1 - descuento);

    }

    @Override
    public int prioridadAcceso() {
        return 0;
    }

    @Override
    double precioFinal() {
        return aplicarDescuento(20);
    }

    @Override
    String descripcion() {
        return "";
    }
}
