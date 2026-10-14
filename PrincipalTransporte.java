
public class PrincipalTransporte {

    public static void main(String[] args) {

        Parada p1, p2, p3, p4;
        Ruta r1, r2;
        Bus b1, b2, b3;
        Persona pa1, pa2, pa3, pa4;

        p1 = new Parada("P-01", "Portal de la Ceiba");
        p2 = new Parada("P-02", "Plaza Ixchel");
        p3 = new Parada("P-03", "Campus Quetzal");
        p4 = new Parada("P-04", "Mercado Yagrumo");

        r1 = new Ruta("R-100", "Sendero de la Ceiba", 450);
        r2 = new Ruta("R-200", "Camino del Quetzal", 380);

        b1 = new Bus("LUN-728", 60);
        b2 = new Bus("SOL-419", 45);
        b3 = new Bus("IXC-563", 50);

        pa1 = new Persona("Amaru Quispe", "estudiante");
        pa2 = new Persona("Yaretzi Xochitl", "ciudadano de oro");
        pa3 = new Persona("Inti Cardenas");
        pa4 = new Persona("Nayeli Itzel", "estudiante");

        System.out.println("==== ESTADO INICIAL DE LAS PARADAS ====");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println();

        System.out.println("==== ESTADO INICIAL DE LAS PERSONAS ====");
        System.out.println(pa1);
        System.out.println(pa2);
        System.out.println(pa3);
        System.out.println(pa4);
        System.out.println();

        r1.agregarParada(p1);
        r1.agregarParada(p2);
        r1.agregarParada(p3);
        r1.agregarParada(p2);

        r2.agregarParada(p1);
        r2.agregarParada(p4);

        r1.registrarSalida(5, 30);
        r1.registrarSalida(6);
        r1.registrarSalida(6, 45);
        r1.registrarSalida(25, 10);

        r2.registrarSalida(7);
        r2.registrarSalida(7, 5);

        System.out.println("==== RECORRIDO Y HORARIOS DE CADA RUTA ====");
        System.out.println(r1.getNombre() + ": "
            + r1.consultarNombresParadas());
        System.out.println("Salidas: " + r1.consultarHorariosSalida());

        System.out.println(r2.getNombre() + ": "
            + r2.consultarNombresParadas());
        System.out.println("Salidas: " + r2.consultarHorariosSalida());
        System.out.println();

        System.out.println("==== RUTA DE CADA BUS ANTES DE ASIGNAR ====");
        System.out.println(b1.getCodigo() + ": " + b1.consultarNombreRuta());
        System.out.println(b2.getCodigo() + ": " + b2.consultarNombreRuta());
        System.out.println(b3.getCodigo() + ": " + b3.consultarNombreRuta());
        System.out.println();

        b1.asignarRuta(r1);
        b2.asignarRuta(r2);

        b1.cobrarPasaje(pa1);
        b1.cobrarPasaje(pa2);
        b1.cobrarPasaje(pa3);
        b2.cobrarPasaje(pa3);
        b2.cobrarPasaje(pa4);
        b3.cobrarPasaje(pa1);

        b3.asignarRuta(r1);
        b3.cobrarPasaje(pa4);

        b2.asignarRuta(r1);

        System.out.println("==== RUTA DE CADA BUS DESPUES DE ASIGNAR ====");
        System.out.println(b1.getCodigo() + ": " + b1.consultarNombreRuta());
        System.out.println(b2.getCodigo() + ": " + b2.consultarNombreRuta());
        System.out.println(b3.getCodigo() + ": " + b3.consultarNombreRuta());
        System.out.println();

        System.out.println("==== ESTADO FINAL DE LAS RUTAS ====");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println();

        System.out.println("==== ESTADO FINAL DE LOS BUSES ====");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println();

        System.out.println("Buses registrados: " + Bus.getCantidadBuses());
    }
}
