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
    public String toString(){
        return "ID" + getId()
                + "Precio: " + precioFinal()
                + " Fecha: " + getFecha()
                + " Zona VIP: " + zonaVIP
                + " Nivel Prioridad: " + nivelPrioridad;


    }
    @Override
    public double aplicarDescuento(int porcentaje) {
        return this.getPrecioBase() * (1 - porcentaje / 100.0);

    }

    @Override
    public int prioridadAcceso() {
        return this.nivelPrioridad ;
    }

    @Override
    double precioFinal() {
        return this.aplicarDescuento(20);
    }

    @Override
    String descripcion() {
        return "";
    }
}
