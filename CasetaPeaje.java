
public class CasetaPeaje {

    private static final double PEAJE_PARTICULAR = 100;
    private static final double PEAJE_CARGA_LIVIANA = 200;
    private static final double PEAJE_CARGA = 500;
    private static final double PEAJE_MOTO = 75;

    private int numeroCaseta;
    private String nombreAutopista;
    private double totalCobrado;
    private static int cantidadCasetas;

    public CasetaPeaje(String pNombreAutopista) {
        cantidadCasetas++;
        numeroCaseta = cantidadCasetas;
        nombreAutopista = pNombreAutopista;
    }

    public void cobrarPeaje(Vehiculo obj) {
        switch (obj.getTipo().toLowerCase()) {
            case "particular":
                totalCobrado += PEAJE_PARTICULAR;
                break;
            case "carga liviana":
                totalCobrado += PEAJE_CARGA_LIVIANA;
                break;
            case "carga":
                totalCobrado += PEAJE_CARGA;
                break;
            case "moto":
                totalCobrado += PEAJE_MOTO;
                break;
        }
    }

    public double getTotalCobrado() {
        return totalCobrado;
    }

    public static int getCantidadDeCasetasPeaje() {
        return cantidadCasetas;
    }

    public String toString() {
        return "Caseta de Peaje número: " + numeroCaseta + "\n"
            + "Autopista= " + nombreAutopista + "\n"
            + "Total Cobrado= " + totalCobrado + "\n";
    }
}
