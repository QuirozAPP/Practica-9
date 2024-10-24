public class Barco extends MedioDeTransporteMecanico {
    public Barco(String nombre, String identificador, int añoCreacion) {
        super(nombre, identificador, añoCreacion);
    }

    public void avanzar() {
        if (isEncendido()) {
            System.out.println("El barco navega hacia adelante.");
        } else {
            System.out.println("Debes encender el barco primero.");
        }
    }

    public void retroceder() {
        if (isEncendido()) {
            System.out.println("El barco retrocede.");
        } else {
            System.out.println("Debes encender el barco primero.");
        }
    }

    public void virar() {
        System.out.println("El barco vira usando el timón.");
    }
}
