public abstract class MedioDeTransporteMecanico extends MedioDeTransporte {
    private boolean encendido;

    public MedioDeTransporteMecanico(String nombre, String identificador, int añoCreacion) {
        super(nombre, identificador, añoCreacion);
        this.encendido = false;
    }

    public void encender() {
        encendido = true;
        System.out.println(getNombre() + " encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println(getNombre() + " apagado.");
    }

    protected boolean isEncendido() {
        return encendido;
    }
}
