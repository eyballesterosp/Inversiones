package GestionDeInversiones;

public class FondosCompartidos extends ActivosCompartidos {

    private double totalActivos;

    public FondosCompartidos(double totalActivos, String simbolo, double costoTotal, double precioActual) {
        super(simbolo, costoTotal, precioActual);
        this.totalActivos = totalActivos;
    }

    @Override
    public double getValorMercado() {
        return totalActivos * precioActual;
    }

    @Override
    public double getBeneficios() {
        return  (this.totalActivos*this.precioActual)-this.costoTotal;
    }

}
