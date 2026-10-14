import java.util.ArrayList;

public class Edificio {

    private String codigo;
    private String nombre;
    private String descripcion;
    public static final String PREFIJO_CODIGO = "Edf-";
    private static int cantidadEdificios = 0;
    private ArrayList<Piso> misPisos;

    public Edificio(String pNombre, String pDescripcion) {
        cantidadEdificios++;
        codigo = PREFIJO_CODIGO + cantidadEdificios;
        nombre = pNombre;
        descripcion = pDescripcion;
        misPisos = new ArrayList<>();
    }

    public void registrarPiso(double pArea, int pCapacidad, String pUso) {
        int numero = misPisos.size() + 1;
        misPisos.add(new Piso(numero, pArea, pCapacidad, pUso));
    }

    public void registrarPiso(double pArea, String pUso) {
        int numero = misPisos.size() + 1;
        misPisos.add(new Piso(numero, pArea, 100, pUso));
    }

    public int consultarCapacidadTotalDelEdificio() {
        int total = 0;

        for (Piso p : misPisos) {
            total += p.getCapacidad();
        }

        return total;
    }

    public double consultarAreaDeUnPiso(int pNumeroPiso) {
        Piso p = buscarPiso(pNumeroPiso);

        if (p == null) {
            return -1.0;
        }

        return p.getArea();
    }

    public String consultarUsoDeUnPiso(int pNumeroPiso) {
        Piso p = buscarPiso(pNumeroPiso);

        if (p == null) {
            return "(desconocido)";
        }

        return p.getUso();
    }

    private Piso buscarPiso(int pNumero) {
        for (Piso p : misPisos) {
            if (p.getNumeroPiso() == pNumero) {
                return p;
            }
        }

        return null;
    }

    public static int getCantidadEdificios() {
        return cantidadEdificios;
    }

    public String toString() {
        String msg = "Edificio\n";
        msg += "Codigo: " + codigo + "\n";
        msg += "Nombre: " + nombre + "\n";
        msg += "Descripcion: " + descripcion + "\n";
        msg += "Pisos: " + misPisos.size() + "\n";

        for (Piso p : misPisos) {
            msg += p.toString() + "\n";
        }

        msg += "Capacidad total: "
            + consultarCapacidadTotalDelEdificio();

        return msg;
    }
}