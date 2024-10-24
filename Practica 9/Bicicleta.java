public class Bicicleta extends MedioDeTransporte {
    public Bicicleta(String nombre, String identificador, int añoCreacion) {
        super(nombre, identificador, añoCreacion);
    }

    public void avanzar() {
        System.out.println("Pedaleando la bicicleta hacia adelante.");
    }

    public void retroceder() {
        System.out.println("Retrocediendo la bicicleta.");
    }

    public void virar() {
        System.out.println("Virando la bicicleta hacia un lado.");
    }
}
