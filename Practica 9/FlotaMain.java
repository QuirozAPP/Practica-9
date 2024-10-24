import java.util.Date;

public class FlotaMain {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("Transporte S.A.", "Calle Falsa 123");
        Flota flota = empresa.getFlota();

        Autobus autobus = new Autobus("Mercedes-Benz O500", "A001", 2015);
        Barco barco = new Barco("Lancha Bayliner 175", "B002", 2010);
        Bicicleta bicicleta = new Bicicleta("Giant Escape 3", "B003", 2020);
        Caballo caballo = new Caballo("Epona", "C001", 2018);

        flota.agregarMedioDeTransporte(autobus);
        flota.agregarMedioDeTransporte(barco);
        flota.agregarMedioDeTransporte(bicicleta);
        flota.agregarMedioDeTransporte(caballo);

        System.out.println("Total de medios de transporte en la flota: " + flota.contarMediosDeTransporte());

        autobus.agregarMantenimiento(new Mantenimiento("Cambio de aceite", new Date(), 200.0));
        barco.agregarMantenimiento(new Mantenimiento("Revisión de motor", new Date(), 300.0));
        bicicleta.agregarMantenimiento(new Mantenimiento("Reparación de frenos", new Date(), 50.0));
        caballo.agregarMantenimiento(new Mantenimiento("Revisión veterinaria", new Date(), 100.0));

        for (MedioDeTransporte medio : flota.obtenerMediosDeTransporte()) {
            System.out.println("Medio de transporte: " + medio.getNombre());
            System.out.println("Historial de mantenimientos:");
            for (Mantenimiento mantenimiento : medio.getHistorialMantenimientos()) {
                System.out.println(" - " + mantenimiento.getTipoMantenimiento() + " - Costo: " + mantenimiento.getCosto());
            }
        }

        autobus.encender();
        autobus.avanzar();
        autobus.retroceder();
        autobus.virar();

        barco.encender();
        barco.avanzar();
        barco.retroceder();
        barco.virar();

        bicicleta.avanzar();
        bicicleta.retroceder();
        bicicleta.virar();

        caballo.preparar();
        caballo.avanzar();
        caballo.retroceder();
        caballo.virar();
        caballo.descansar();
    }
}
