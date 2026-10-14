
public class Parada {

    private String codigo;
    private String nombre;

    public Parada(String pCodigo, String pNombre) {
        codigo = pCodigo;
        nombre = pNombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return "Codigo: " + codigo + "\n"
            + "Nombre: " + nombre;
    }
}
