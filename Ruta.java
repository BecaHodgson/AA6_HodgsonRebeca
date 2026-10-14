
import java.util.ArrayList;

public class Ruta {

    private String codigo;
    private String nombre;
    private double tarifa;
    private ArrayList<Parada> misParadas;
    private ArrayList<Horario> misHorarios;

    public Ruta(String pCodigo, String pNombre, double pTarifa) {
        codigo = pCodigo;
        nombre = pNombre;
        tarifa = pTarifa;
        misParadas = new ArrayList<>();
        misHorarios = new ArrayList<>();
    }

    public void agregarParada(Parada pParada) {
        if (!misParadas.contains(pParada)) {
            misParadas.add(pParada);
        }
    }

    public void registrarSalida(int pHora, int pMinuto) {
        if (pHora >= 0 && pHora <= 23
            && pMinuto >= 0 && pMinuto <= 59) {
            misHorarios.add(new Horario(pHora, pMinuto));
        }
    }

    public void registrarSalida(int pHora) {
        registrarSalida(pHora, 0);
    }

    public String consultarNombresParadas() {
        String nombres = "";

        for (int i = 0; i < misParadas.size(); i++) {
            nombres += misParadas.get(i).getNombre();

            if (i < misParadas.size() - 1) {
                nombres += ", ";
            }
        }

        return nombres;
    }

    public String consultarHorariosSalida() {
        String horarios = "";

        for (int i = 0; i < misHorarios.size(); i++) {
            horarios += misHorarios.get(i).toString();

            if (i < misHorarios.size() - 1) {
                horarios += ", ";
            }
        }

        return horarios;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTarifa() {
        return tarifa;
    }

    public String toString() {
        return "Codigo: " + codigo + "\n"
            + "Nombre: " + nombre + "\n"
            + "Tarifa: " + tarifa + " colones\n"
            + "Paradas: " + consultarNombresParadas() + "\n"
            + "Cantidad de horarios: " + misHorarios.size() + "\n"
            + "Horarios: " + consultarHorariosSalida();
    }
}
