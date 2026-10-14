
public class Horario {

    private int hora;
    private int minuto;

    public Horario(int pHora, int pMinuto) {
        hora = pHora;
        minuto = pMinuto;
    }

    public String toString() {
        String horaTexto = hora < 10 ? "0" + hora : "" + hora;
        String minutoTexto = minuto < 10 ? "0" + minuto : "" + minuto;

        return horaTexto + ":" + minutoTexto;
    }
}
