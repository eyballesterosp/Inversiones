package GestionDeInversiones;

public class Dinero implements Activos {

    private double cantidad;

    public Dinero(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public double getValorMercado() {
        return this.cantidad;
    }

    @Override
    public double getBeneficios() {
        return this.cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

}
