import java.util.ArrayList;

public class Flota {
    private ArrayList<MedioDeTransporte> mediosDeTransporte;

    public Flota() {
        mediosDeTransporte = new ArrayList<>();
    }

    public void agregarMedioDeTransporte(MedioDeTransporte medio) {
        mediosDeTransporte.add(medio);
    }

    public void agregarMediosDeTransporte(ArrayList<MedioDeTransporte> medios) {
        mediosDeTransporte.addAll(medios);
    }

    public void eliminarMedioDeTransporte(MedioDeTransporte medio) {
        mediosDeTransporte.remove(medio);
    }

    public ArrayList<MedioDeTransporte> obtenerMediosDeTransporte() {
        return mediosDeTransporte;
    }

    public int contarMediosDeTransporte() {
        return mediosDeTransporte.size();
    }
}
