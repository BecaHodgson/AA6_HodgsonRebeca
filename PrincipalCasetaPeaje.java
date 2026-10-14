public class PrincipalCasetaPeaje {

    public static void main(String[] args) {

        Vehiculo a, b, c, d, e, f, g;

        a = new Vehiculo("LIM101", "particular", "Toyota", "Corolla", 2018);
        b = new Vehiculo("LIM202", "carga liviana", "Isuzu", "NPR", 2020);
        c = new Vehiculo("LIM303", "moto", "Honda", "CBR", 2022);
        d = new Vehiculo("LIM404", "carga", "Freightliner", "M2", 2021);
        e = new Vehiculo("LIM505", "moto", "Yamaha", "FZ", 2022);
        f = new Vehiculo("LIM606", "particular", "Honda", "Civic", 2018);
        g = new Vehiculo("LIM707", "particular", "Tesla", "Model 3", 2025);

        CasetaPeaje unaCaseta, otraCaseta;

        unaCaseta = new CasetaPeaje("Ruta del Caribe");
        otraCaseta = new CasetaPeaje("Ruta del Caribe");

        unaCaseta.cobrarPeaje(a);
        unaCaseta.cobrarPeaje(b);
        unaCaseta.cobrarPeaje(c);

        otraCaseta.cobrarPeaje(d);
        otraCaseta.cobrarPeaje(e);
        otraCaseta.cobrarPeaje(f);
        otraCaseta.cobrarPeaje(g);

        System.out.println("La primera caseta:");
        System.out.println(unaCaseta);

        System.out.println("La segunda caseta:");
        System.out.println(otraCaseta);

        System.out.println("Casetas creadas: "
            + CasetaPeaje.getCantidadDeCasetasPeaje());

        System.out.println("Primer vehículo creado:");
        System.out.println(a);
    }
}