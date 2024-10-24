public class Autobus extends MedioDeTransporteMecanico {
    public Autobus(String nombre, String identificador, int añoCreacion) {
        super(nombre, identificador, añoCreacion);
    }

    public void avanzar() {
        if (isEncendido()) {
            System.out.println("El autobús avanza.");
        } else {
            System.out.println("Debes encender el autobús primero.");
        }
    }

    public void retroceder() {
        if (isEncendido()) {
            System.out.println("El autobús retrocede.");
        } else {
            System.out.println("Debes encender el autobús primero.");
        }
    }

    public void virar() {
        System.out.println("El autobús vira.");
    }
}
