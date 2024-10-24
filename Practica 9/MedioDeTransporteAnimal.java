public abstract class MedioDeTransporteAnimal extends MedioDeTransporte {
    public MedioDeTransporteAnimal(String nombre, String identificador, int añoCreacion) {
        super(nombre, identificador, añoCreacion);
    }

    public abstract void preparar();

    public abstract void descansar();
}
