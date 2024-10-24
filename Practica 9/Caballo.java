public class Caballo extends MedioDeTransporteAnimal {
    public Caballo(String nombre, String identificador, int añoCreacion) {
        super(nombre, identificador, añoCreacion);
    }

    public void avanzar() {
        System.out.println("El caballo avanza.");
    }

    public void retroceder() {
        System.out.println("El caballo retrocede.");
    }

    public void virar() {
        System.out.println("El caballo vira.");
    }

    public void preparar() {
        System.out.println("Preparando el caballo.");
    }

    public void descansar() {
        System.out.println("El caballo descansa.");
    }
}
