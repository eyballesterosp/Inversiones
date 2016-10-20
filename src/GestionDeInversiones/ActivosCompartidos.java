package GestionDeInversiones;

public abstract class ActivosCompartidos implements Activos {

    protected String simbolo;
    protected double costoTotal, precioActual;

    public ActivosCompartidos(String simbolo, double costoTotal, double precioActual) {
        this.simbolo = simbolo;
        this.costoTotal = costoTotal;
        this.precioActual = precioActual;
    }

}
