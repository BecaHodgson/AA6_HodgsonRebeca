
public class Persona {

    public static final String REGULAR = "regular";
    public static final String ESTUDIANTE = "estudiante";
    public static final String CIUDADANO_DE_ORO = "ciudadano de oro";

    private String nombre;
    private String condicion;

    public Persona(String pNombre, String pCondicion) {
        nombre = pNombre;
        condicion = pCondicion;
    }

    public Persona(String pNombre) {
        this(pNombre, REGULAR);
    }

    public String getNombre() {
        return nombre;
    }

    public String getCondicion() {
        return condicion;
    }

    public String toString() {
        return "Nombre: " + nombre + "\n"
            + "Condicion: " + condicion;
    }
}
