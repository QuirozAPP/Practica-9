import java.util.ArrayList;

public abstract class MedioDeTransporte {
    private String nombre;
    private String identificador;
    private int añoCreacion;
    private ArrayList<Mantenimiento> historialMantenimientos;

    public MedioDeTransporte(String nombre, String identificador, int añoCreacion) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.añoCreacion = añoCreacion;
        this.historialMantenimientos = new ArrayList<>();
    }

    public void agregarMantenimiento(Mantenimiento mantenimiento) {
        historialMantenimientos.add(mantenimiento);
    }

    public void agregarMantenimientos(ArrayList<Mantenimiento> mantenimientos) {
        historialMantenimientos.addAll(mantenimientos);
    }

    public abstract void avanzar();

    public abstract void retroceder();

    public abstract void virar();

    public String getNombre() {
        return nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public int getAñoCreacion() {
        return añoCreacion;
    }

    public ArrayList<Mantenimiento> getHistorialMantenimientos() {
        return historialMantenimientos;
    }
}
