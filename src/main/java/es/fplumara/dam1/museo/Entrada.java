package es.fplumara.dam1.museo;
import java.time.LocalDate;


public abstract class Entrada {

    private String id;
    private double precioBase;
    private LocalDate fecha;

    // GETTERS Y SETTERS
    public double getPrecioBase() {
        return precioBase;
    }

    public String getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    // CONSTRUCTOR
    protected Entrada(String id, double precioBase, LocalDate fecha) {
        this.fecha = fecha;
        this.precioBase = precioBase;
        this.id = id;
    }

    public String toString(){
        return " ID" + id
                + " Precio" + precioBase
                + " Fecha" + fecha;

    }
    // LE DECIMOS QUE LOS HIJOS DE ENTRADA TENGAN QUE CALCULAR ESTO SI O SI PERO NO LE DECIMOS COMO LO CALCULA
    abstract double precioFinal();
    abstract String descripcion();



}
