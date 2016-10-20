package GestionDeInversiones;

public class Acciones extends ActivosCompartidos {

    protected int totalActivos;

    public Acciones(int totalActivos, String simbolo, double costoTotal, double precioActual) {
        super(simbolo, costoTotal, precioActual);
        this.totalActivos = totalActivos;
    }

    @Override
    public double getValorMercado() {
        return this.totalActivos * this.precioActual;
    }

    @Override
    public double getBeneficios() {
        return (this.costoTotal * this.precioActual) - this.costoTotal;
    }

}
