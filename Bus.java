
public class Bus {

    public static final String PREFIJO_CODIGO = "BUS-";
    public static final double DESCUENTO_ESTUDIANTE = 0.50;
    public static final double DESCUENTO_CIUDADANO_DE_ORO = 1.00;

    private static int cantidadBuses = 0;

    private String codigo;
    private String placa;
    private int capacidad;
    private Ruta rutaAsignada;
    private int personasAtendidas;
    private double totalRecaudado;

    public Bus(String pPlaca, int pCapacidad) {
        cantidadBuses++;
        codigo = PREFIJO_CODIGO + cantidadBuses;
        placa = pPlaca;
        capacidad = pCapacidad;
        personasAtendidas = 0;
        totalRecaudado = 0;
        rutaAsignada = null;
    }

    public void asignarRuta(Ruta pRuta) {
        rutaAsignada = pRuta;
    }

    public String consultarNombreRuta() {
        if (rutaAsignada == null) {
            return "(sin ruta asignada)";
        }

        return rutaAsignada.getNombre();
    }

    public void cobrarPasaje(Persona pPersona) {
        if (rutaAsignada == null) {
            return;
        }

        double monto = rutaAsignada.getTarifa();

        if (pPersona.getCondicion().equals(Persona.ESTUDIANTE)) {
            monto = monto * (1 - DESCUENTO_ESTUDIANTE);
        } else if (pPersona.getCondicion().equals(Persona.CIUDADANO_DE_ORO)) {
            monto = monto * (1 - DESCUENTO_CIUDADANO_DE_ORO);
        }

        totalRecaudado += monto;
        personasAtendidas++;
    }

    public String getCodigo() {
        return codigo;
    }

    public static int getCantidadBuses() {
        return cantidadBuses;
    }

    public String toString() {
        return "Codigo: " + codigo + "\n"
            + "Placa: " + placa + "\n"
            + "Capacidad: " + capacidad + "\n"
            + "Ruta asignada: " + consultarNombreRuta() + "\n"
            + "Personas atendidas: " + personasAtendidas + "\n"
            + "Total recaudado: " + totalRecaudado + " colones";
    }
}
