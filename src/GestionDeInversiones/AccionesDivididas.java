
package GestionDeInversiones;

public class AccionesDivididas extends Acciones{
    private double dividendos;

    public AccionesDivididas(double dividendos, int totalActivos, String simbolo, double costoTotal, double precioActual) {
        super(totalActivos, simbolo, costoTotal, precioActual);
        this.dividendos = dividendos;
    }
    
    public double getValorMercado(){
        return (super.getValorMercado() + this.dividendos);
    }
}
