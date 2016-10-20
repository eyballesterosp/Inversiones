package GestionDeInversiones;

public class Cliente {

    private String nombre, apellido, cc;
    private int telefono, edad;
    private Acciones[] Acciones;

    public Cliente(String nombre, String apellido, String cc, int telefono, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cc = cc;
        this.telefono = telefono;
        this.edad = edad;
        this.Acciones = new Acciones[10];
    }

    public double sumBeneicios() {
        return 0;
    }

    public double sumValorMercado() {
        return 0;
    }

    public boolean addActivos(Acciones activo){
        return true;
    }
    
    public double calcValorTotalMercado(){
        return 0;
    }
}
