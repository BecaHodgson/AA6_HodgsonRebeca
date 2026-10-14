
public class PrincipalEdificio {

    public static void main(String[] args) {

        Edificio e1 = new Edificio(
            "Ceiba",
            "Centro de Innovacion y Saberes"
        );

        e1.registrarPiso(500.0, 200, "Aula Quetzal");
        e1.registrarPiso(350.0, "Laboratorio Ixchel");
        e1.registrarPiso(275.5, 120, "Administracion Itzel");

        System.out.println("==== EDIFICIO CEIBA ====");
        System.out.println(e1);
        System.out.println("Capacidad total de Ceiba: "
            + e1.consultarCapacidadTotalDelEdificio());
        System.out.println("Area del piso 2 de Ceiba: "
            + e1.consultarAreaDeUnPiso(2));
        System.out.println("Uso del piso 1 de Ceiba: "
            + e1.consultarUsoDeUnPiso(1));

        Edificio e2 = new Edificio(
            "Yagrumo",
            "Archivo de Memoria y Cultura"
        );

        e2.registrarPiso(600.0, "Sala Cacao");
        e2.registrarPiso(400.0, 90, "Archivo Quimbaya");

        System.out.println("==== EDIFICIO YAGRUMO ====");
        System.out.println(e2);
        System.out.println("Capacidad total de Yagrumo: "
            + e2.consultarCapacidadTotalDelEdificio());
        System.out.println("Area del piso 1 de Yagrumo: "
            + e2.consultarAreaDeUnPiso(1));
        System.out.println("Uso del piso 2 de Yagrumo: "
            + e2.consultarUsoDeUnPiso(2));

        System.out.println("Edificios creados: "
            + Edificio.getCantidadEdificios());
    }
}
